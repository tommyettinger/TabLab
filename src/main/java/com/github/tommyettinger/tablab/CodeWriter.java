package com.github.tommyettinger.tablab;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class CodeWriter
{
    public String toolsPackage = null, toolsClass = null, numbersPackage = "java.lang", numbersClass = "Double";
    public CodeWriter()
    {
    }
    public CodeWriter(String toolsPackage, String toolsClass, String numbersPackage, String numbersClass)
    {
        if(toolsPackage != null && !toolsPackage.isEmpty() && toolsClass != null && !toolsClass.isEmpty())
        {
            this.toolsPackage = toolsPackage;
            this.toolsClass = toolsClass;
        }
        if(numbersPackage != null && !numbersPackage.isEmpty() && numbersClass != null && !numbersClass.isEmpty())
        {
            this.numbersPackage = numbersPackage;
            this.numbersClass = numbersClass;
        }
    }

    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final TypeName STR = TypeName.get(String.class);
    private static final ClassName VOI = ClassName.get(Void.class);
    public static final HashMap<String, TypeName> typenames = new HashMap<>(32);
    public static final HashMap<TypeName, String> defaults = new HashMap<>(32);
    static {
        typenames.put("String", STR);
        typenames.put("str", STR);
        typenames.put("s", STR);
        typenames.put("bool", TypeName.BOOLEAN);
        typenames.put("boolean", TypeName.BOOLEAN);
        typenames.put("b", TypeName.BOOLEAN);
        typenames.put("char", TypeName.CHAR);
        typenames.put("c", TypeName.CHAR);
        typenames.put("int", TypeName.INT);
        typenames.put("i", TypeName.INT);
        typenames.put("long", TypeName.LONG);
        typenames.put("l", TypeName.LONG);
        typenames.put("float", TypeName.FLOAT);
        typenames.put("f", TypeName.FLOAT);
        typenames.put("double", TypeName.DOUBLE);
        typenames.put("d", TypeName.DOUBLE);
        typenames.put("Object", TypeName.OBJECT);
        typenames.put("object", TypeName.OBJECT);
        typenames.put("o", TypeName.OBJECT);
        defaults.put(STR, "");
        defaults.put(TypeName.BOOLEAN, "false");
        defaults.put(TypeName.CHAR, "' '");
        defaults.put(TypeName.INT, "0");
        defaults.put(TypeName.LONG, "0L");
        defaults.put(TypeName.FLOAT, "0.0f");
        defaults.put(TypeName.DOUBLE, "0.0");
    }
    public String writeToString(TSVReader reader)
    {
        return write(reader).toString();
    }

    public void writeTo(TSVReader reader, Appendable appendable)
    {
        try {
            write(reader).writeTo(appendable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeTo(TSVReader reader, File file) {
        try {
            Path p = file.toPath();//, outputDirectory = p;
            JavaFile jf = write(reader);
            jf.writeTo(p);
//            if (!reader.packageName.isEmpty()) {
//                for (String packageComponent : StringKit.split(reader.packageName, ".")) {
//                    outputDirectory = outputDirectory.resolve(packageComponent);
//                }
//            }
            if(toolsClass == null) {
                try (Writer writer = new OutputStreamWriter(Files.newOutputStream(
                        Files.createDirectories(p.resolve(jf.packageName.replace('.', '/'))).resolve("TabLabTools.java")), UTF_8)) {
                    writer.write(
                            new Scanner(CodeWriter.class.getResourceAsStream("/TabLabTools.txt"), "UTF-8").useDelimiter("\\A").next()
                    );
                }
            }
//                                    .replaceFirst("###~~~###", Matcher.quoteReplacement(reader.packageName))

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JavaFile write(TSVReader reader)
    {
        String packageName = "generated";
        ClassName tlt;
        TypeSpec.Builder tb = TypeSpec.classBuilder(reader.name).addModifiers(mods).addSuperinterface(Serializable.class);
        tb.addField(FieldSpec.builder(TypeName.LONG, "serialVersionUID", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer("1L").build());
        tb.addMethod(MethodSpec.constructorBuilder().addModifiers(mods).build());
        MethodSpec.Builder make = MethodSpec.constructorBuilder().addModifiers(mods);
        if(toolsClass == null)
            tlt = ClassName.get(packageName, "TabLabTools");
        else
            tlt = ClassName.get(toolsPackage, toolsClass);
        String section, field, tmp;
        int fieldCount = reader.headerLine.length;
        TypeName typename, typenameExtra1 = null, typenameExtra2 = null;
        TypeName[] typenameFields = new TypeName[fieldCount];
        TypeName[] typenameExtras1 = new TypeName[fieldCount];
        TypeName[] typenameExtras2 = new TypeName[fieldCount];
        boolean[] stringFields = new boolean[fieldCount];
        boolean[] stringExtras = new boolean[fieldCount];
        ClassName[] crossFields = new ClassName[fieldCount];
        ClassName[] crossExtras = new ClassName[fieldCount];
        String[] arraySeparators = new String[fieldCount];
        String[] fieldNames = new String[fieldCount];
        ParameterizedTypeName mapTypename = null;
        int mapKeyIndex = -1;
        ClassName myName = ClassName.get(packageName, reader.name);
        for (int i = 0; i < fieldCount; i++) {
            section = reader.headerLine[i];
            if("".equals(section))
            {
                crossFields[i] = VOI;
                stringFields[i] = false;
                typenameFields[i] = VOI;
                fieldNames[i] = "";
                continue;
            }
            int caret = section.indexOf('^'), colon = section.indexOf(':'), arrayStart = section.indexOf('['),
                    mapStart = section.indexOf('{'), mapEnd = section.indexOf('}'),
                    typeLen = Math.max(arrayStart, mapStart);
            if(typeLen < 0) {
                if (caret >= 0) {
                    reader.headerLine[i] = section = StringKit.safeSubstring(section, 0, caret);
                    crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, section.length())) ? VOI : ClassName.get(packageName, tmp);
                    typename = colon < 0 ? STR : typenames.getOrDefault(tmp, crossFields[i]);
                    if(stringFields[i] = typename.equals(STR))
                        reader.keyColumn = colon < 0 ? section : section.substring(0, colon);
                } else if (reader.keyColumn == null) {
                    crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, section.length())) ? VOI : ClassName.get(packageName, tmp);
                    typename = colon < 0 ? STR : typenames.getOrDefault(tmp, crossFields[i]);
                    if(stringFields[i] = typename.equals(STR))
                        reader.keyColumn = colon < 0 ? section : section.substring(0, colon);
                } else {
                    crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, section.length())) ? VOI : ClassName.get(packageName, tmp);
                    typename = colon < 0 ? STR : typenames.getOrDefault(tmp, crossFields[i]);
                    stringFields[i] = typename.equals(STR);
                }
            }
            else if(arrayStart >= 0) {
                crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, arrayStart)) ? VOI : ClassName.get(packageName, tmp);
                typename = typenames.getOrDefault(tmp, crossFields[i]);
                stringFields[i] = typename.equals(STR);
                typename = ArrayTypeName.of(typename);
                arraySeparators[i] = section.substring(arrayStart+1, section.indexOf(']'));
            }
            else { // map case
                crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, mapStart)) ? VOI : ClassName.get(packageName, tmp);
                typenameExtras1[i] = typenameExtra1 = typenames.getOrDefault(tmp, crossFields[i]).box();
                crossExtras[i] = typenames.containsKey(tmp = section.substring(mapEnd + 1, section.length())) ? VOI : ClassName.get(packageName, tmp);
                typenameExtras2[i] = typenameExtra2 = typenames.getOrDefault(tmp, crossExtras[i]).box();
                stringFields[i] = typenameExtra1.equals(STR);
                stringExtras[i] = typenameExtra2.equals(STR);
                typename = ParameterizedTypeName.get(ClassName.get("java.util", "Map"), typenameExtra1, typenameExtra2);
                arraySeparators[i] = section.substring(mapStart+1, mapEnd);
            }
            typenameFields[i] = typename;
            field = StringKit.safeSubstring(section, 0, colon);
            tb.addField(typename, field, mods);
            fieldNames[i] = field;
            if(field.equals(reader.keyColumn) && typename.equals(STR)) {
                if (typeLen < 0) {
                    mapTypename = ParameterizedTypeName.get(ClassName.get("java.util", "Map"), STR, myName);
                    mapKeyIndex = i;
                }
            }
            make.addParameter(typename, field).addStatement("this.$N = $N", field, field);
        }
        tb.addMethod(make.build());
        ClassName cn = ClassName.get(packageName, reader.name);
        makeHashCode(tb, fieldNames, typenameFields);
        makeEquals(tb, cn, fieldNames, typenameFields);
        if(reader.contentLines.length > 0) {
            ArrayTypeName atn = ArrayTypeName.of(cn);
            CodeBlock.Builder cbb = CodeBlock.builder();
            cbb.beginControlFlow("new $T", atn);
            for (int i = 0; i < reader.contentLines.length; i++) {
                cbb.add("new $T(", cn);
                int j = 0;
                for (; j < fieldCount; j++) {
                    if(VOI.equals(typenameFields[j]))
                        continue;
                    if (arraySeparators[j] != null) {
                        if (typenameExtras1[j] != null) {
                            if (!reader.contentLines[i][j].contains(arraySeparators[j]))
                                cbb.add("$T.<$T, $T>makeMap()", tlt, typenameExtras1[j], typenameExtras2[j]);
                            else
                                cbb.add("$T.makeMap($L)", tlt,
                                        stringLiterals((stringFields[j] ? 1 : 0) + (stringExtras[j] ? 2 : 0) - 1, crossFields[j], crossExtras[j], 80,
                                                StringKit.split(reader.contentLines[i][j], arraySeparators[j])));
                        } else {
                            cbb.add("new $T {$L}", typenameFields[j],
                                    stringLiterals((stringFields[j] ? 2 : -1), crossFields[j], null,
                                            80, StringKit.split(reader.contentLines[i][j], arraySeparators[j])));
                        }
                    } else if (stringFields[j] || stringExtras[j]) {
                        cbb.add("$S", reader.contentLines[i][j]);
                    } else {
                        cbb.add("$L", reader.contentLines[i][j].isEmpty()
                                ? Objects.toString(defaults.get(typenameFields[j]))
                                : TypeName.CHAR.equals(typenameFields[j])
                                ? "'" + reader.contentLines[i][j] + "'"
                                : reader.contentLines[i][j]);
                    }
                    if (j < fieldCount - 1)
                        cbb.add(", ");
                }

                cbb.add("),\n");
            }
            cbb.unindent();
            cbb.add("}");

            tb.addField(FieldSpec.builder(atn, "ENTRIES", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer(cbb.build()).build());
            if (mapKeyIndex >= 0) {
                cbb = CodeBlock.builder();
                String[] mapStuff = new String[reader.contentLines.length * 2];
                for (int i = 0; i < reader.contentLines.length; i++) {
                    mapStuff[i * 2] = reader.contentLines[i][mapKeyIndex];
                    mapStuff[i * 2 + 1] = "ENTRIES[" + i + "]";
                }
                cbb.add("$T.makeMap(\n$L)", tlt, stringLiterals(0, VOI, VOI, 80, mapStuff)); // alternationCode: (stringFields[mapKeyIndex] ? 0 : -1)
                tb.addField(FieldSpec.builder(mapTypename, "MAPPING", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer(cbb.build()).build());
                MethodSpec.Builder mb = MethodSpec.methodBuilder("get").addModifiers(Modifier.PUBLIC, Modifier.STATIC).returns(myName).addParameter(STR, "item").addCode("return MAPPING.get($N);\n", "item");
                tb.addMethod(mb.build());
            }
        }
        TypeSpec t = tb.build();
        return JavaFile.builder(packageName, t).addStaticImport(tlt, "makeMap").skipJavaLangImports(true).build();
    }

    private void makeHashCode(TypeSpec.Builder tb, String[] fieldNames, TypeName[] fieldTypes)
    {
        tb.addMethod(MethodSpec.methodBuilder("hash64").addModifiers(Modifier.PRIVATE, Modifier.STATIC).returns(TypeName.LONG).addParameter(STR, "data")
                .addCode("if (data == null) return 0;\n" +
                        "long result = 0x9E3779B97F4A7C94L, a = 0x632BE59BD9B4E019L;\n" +
                        "final int len = data.length();\n" +
                        "for (int i = 0; i < len; i++)\n" +
                        "  result += (a ^= 0x8329C6EB9E6AD3E3L * data.charAt(i));\n" +
                        "return result * (a | 1L) ^ (result >>> 27 | result << 37);\n").build());
        tb.addMethod(MethodSpec.methodBuilder("hashBasic").addModifiers(Modifier.PRIVATE, Modifier.STATIC).returns(TypeName.LONG).addParameter(TypeName.OBJECT, "data")
                .addCode("return (data == null) ? 0 : data.hashCode() * 0x5851F42D4C957F2DL + 0x14057B7EF767814FL;\n").build());

        MethodSpec.Builder mb = MethodSpec.methodBuilder("hash64").addModifiers(Modifier.PUBLIC).returns(TypeName.LONG);
        mb.addCode("long result = 0x9E3779B97F4A7C94L, a = 0x632BE59BD9B4E019L, innerR, innerA;\nint len;\n");
        int len = Math.min(fieldNames.length, fieldTypes.length);
        TypeName tn;
        String fn;
        TypeName nt = ClassName.get(numbersPackage, numbersClass);
        for (int i = 0; i < len; i++) {
            fn = fieldNames[i];
            tn = fieldTypes[i];
            if(fn == null || fn.isEmpty()) continue;
            if(tn.isPrimitive())
            {
                if(tn.equals(TypeName.DOUBLE) || tn.equals(TypeName.FLOAT))
                {
                    mb.addStatement("result += (a ^= 0x8329C6EB9E6AD3E3L * $T.doubleToLongBits($N))", nt, fn);
                }
                else if(tn.equals(TypeName.BOOLEAN))
                {
                    mb.addStatement("result += (a ^= 0x8329C6EB9E6AD3E3L * ($N ? 0xC6BC279692B5CC83L : 0xAEF17502108EF2D9L))", fn);
                }
                else
                {
                    mb.addStatement("result += (a ^= 0x8329C6EB9E6AD3E3L * $N)", fn);
                }
            }
            else if(tn.equals(STR))
            {
                mb.addStatement("result += (a ^= 0x8329C6EB9E6AD3E3L * hash64($N))", fn);
            }
            else if(tn instanceof ArrayTypeName)
            {
                tn = ((ArrayTypeName)tn).componentType;
                mb.addStatement("innerR = 0x9E3779B97F4A7C94L");
                mb.addStatement("innerA = 0x632BE59BD9B4E019L");
                mb.addStatement("len = ($N == null ? 0 : $N.length)", fn, fn);
                if(tn.isPrimitive()) {
                    if (tn.equals(TypeName.DOUBLE) || tn.equals(TypeName.FLOAT)) {
                        mb.addCode("for (int i = 0; i < len; i++) innerR += (innerA ^= 0x8329C6EB9E6AD3E3L * $T.doubleToLongBits($N[i]));\n", nt, fn);
                    } else if (tn.equals(TypeName.BOOLEAN)) {
                        mb.addCode("for (int i = 0; i < len; i++) innerR += (innerA ^= 0x8329C6EB9E6AD3E3L * ($N[i] ? 0xC6BC279692B5CC83L : 0xAEF17502108EF2D9L));\n", fn);
                    } else {
                        mb.addCode("for (int i = 0; i < len; i++) innerR += (innerA ^= 0x8329C6EB9E6AD3E3L * $N[i]);\n", fn);
                    }
                }
                else if(tn.equals(STR))
                {
                    mb.addCode("for (int i = 0; i < len; i++) innerR += (innerA ^= 0x8329C6EB9E6AD3E3L * hash64($N[i]));\n", fn);
                }
                else
                {
                    mb.addCode("for (int i = 0; i < len; i++) innerR += (innerA ^= 0x8329C6EB9E6AD3E3L * hashBasic($N[i]));\n", fn);
                }
                mb.addStatement("a += innerA");
                mb.addStatement("result ^= innerR * (innerA | 1L) ^ (innerR >>> 27 | innerR << 37)");
            }
            else
            {
                mb.addStatement("result += (a ^= 0x8329C6EB9E6AD3E3L * hashBasic($N))", fn);
            }
        }
        mb.addStatement("return result * (a | 1L) ^ (result >>> 27 | result << 37)");
        tb.addMethod(mb.build());
        tb.addMethod(MethodSpec.methodBuilder("hashCode").addModifiers(mods).returns(TypeName.INT).addStatement("return (int)(hash64() & 0xFFFFFFFFL)").build());
    }
    private void makeEquals(TypeSpec.Builder tb, ClassName cn, String[] fieldNames, TypeName[] fieldTypes)
    {
        tb.addMethod(MethodSpec.methodBuilder("stringArrayEquals").addModifiers(Modifier.PRIVATE, Modifier.STATIC).returns(TypeName.BOOLEAN).addParameter(ArrayTypeName.of(STR), "left").addParameter(ArrayTypeName.of(STR), "right")
                .addCode("if (left == right) return true;\n" +
                        "if (left == null || right == null) return false;\n" +
                        "final int len = left.length;\n" +
                        "if(len != right.length) return false;\n" +
                        "String l, r;\n" +
                        "for (int i = 0; i < len; i++) { if(((l = left[i]) != (r = right[i])) && (((l == null) != (r == null)) || !l.equals(r))) { return false; } }\n" +
                        "return true;\n").build());

        MethodSpec.Builder mb = MethodSpec.methodBuilder("equals").addModifiers(Modifier.PUBLIC).returns(TypeName.BOOLEAN).addParameter(TypeName.OBJECT, "o");
        mb.addCode("if (this == o) return true;\nif (o == null || getClass() != o.getClass()) return false;\n$T other = ($T) o;\n", cn, cn);
        int len = Math.min(fieldNames.length, fieldTypes.length);
        TypeName tn, arrays = TypeName.get(Arrays.class);
        String fn;
        for (int i = 0; i < len; i++) {
            fn = fieldNames[i];
            tn = fieldTypes[i];
            if(fn == null || fn.isEmpty()) continue;
            if(tn.isPrimitive())
            {
                mb.addStatement("if ($N != other.$N) return false", fn, fn);
            }
//            else if(tn.equals(STR))
//            {
//                mb.addStatement("if ($N != null ? !$N.equals(other.$N) : other.$N != null) return false", fn, fn, fn, fn);
//            }
            else if(tn instanceof ArrayTypeName)
            {
                tn = ((ArrayTypeName)tn).componentType;
                if(tn.isPrimitive()) {
                    mb.addStatement("if(!$T.equals($N, other.$N)) return false", arrays, fn, fn);
                }
                else if(tn.equals(STR))
                {
                    mb.addStatement("if(!stringArrayEquals($N, other.$N)) return false", fn, fn);
                }
                else
                {
                    mb.addStatement("if(!$T.deepEquals($N, other.$N)) return false", arrays, fn, fn);
                }
            }
            else
            {
                mb.addStatement("if ($N != null ? !$N.equals(other.$N) : other.$N != null) return false", fn, fn, fn, fn);
            }
        }
        mb.addStatement("return true");
        tb.addMethod(mb.build());
    }

    private static String characterLiteral(char c) {
        // see https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6
        switch (c) {
            case '\b': return "\\b"; /* \u0008: backspace (BS) */
            case '\t': return "\\t"; /* \u0009: horizontal tab (HT) */
            case '\n': return "\\n"; /* \u000a: linefeed (LF) */
            case '\f': return "\\f"; /* \u000c: form feed (FF) */
            case '\r': return "\\r"; /* \u000d: carriage return (CR) */
            case '\"': return "\"";  /* \u0022: double quote (") */
            case '\'': return "\\'"; /* \u0027: single quote (') */
            case '\\': return "\\\\";  /* \u005c: backslash (\) */
            default:
                return Character.isISOControl(c) ? String.format("\\u%04x", (int) c) : Character.toString(c);
        }
    }

    /**
     * Returns the string literal representing {@code value}, including wrapping double quotes.
     * From CodePoet source (com.squareup.javapoet.Util), with small changes.
     * @param value the value to escape as a String
     * @return the string literal representing {@code value}, including wrapping double quotes.
     */
    private static String stringLiteral(String value) {
        StringBuilder result = new StringBuilder(value.length() + 2);
        result.append('"');
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            // trivial case: single quote must not be escaped
            if (c == '\'') {
                result.append("'");
                continue;
            }
            // trivial case: double quotes must be escaped
            if (c == '\"') {
                result.append("\\\"");
                continue;
            }
            // default case: just let character literal do its work
            result.append(characterLiteral(c));
        }
        result.append('"');
        return result.toString();
    }
    /**
     * Returns the string literals, separated by ", " representing {@code values}, including wrapping double quotes.
     * From CodePoet source (com.squareup.javapoet.Util), with small changes.
     * @param values the values to escape as a String
     * @return the string literal representing {@code value}, including wrapping double quotes and comma separators.
     */
    private static String stringLiterals(String... values) {
        StringBuilder result = new StringBuilder(values.length * 8);
        for (int s = 0; s < values.length;) {
            String value = values[s];
            result.append('"');
            for (int i = 0; i < value.length(); i++) {
                char c = value.charAt(i);
                // trivial case: single quote must not be escaped
                if (c == '\'') {
                    result.append("'");
                    continue;
                }
                // trivial case: double quotes must be escaped
                if (c == '\"') {
                    result.append("\\\"");
                    continue;
                }
                // default case: just let character literal do its work
                result.append(characterLiteral(c));
            }
            if(++s < values.length)
                result.append("\", ");
            else
                result.append('"');
        }
        return result.toString();
    }
    /**
     * Returns the string literals, separated by ", " representing {@code values}, including wrapping double quotes.
     * From CodePoet source (com.squareup.javapoet.Util), with small changes.
     * @param values the values to escape as a String
     * @return the string literal representing {@code value}, including wrapping double quotes and comma separators.
     */
    private static String stringLiterals(int alternationCode, String... values) {
        StringBuilder result = new StringBuilder(values.length * 8);
        for (int s = 0; s < values.length;) {
            if(alternationCode >= 2 || (s & 1) == alternationCode) {
                String value = values[s];
                result.append('"');
                for (int i = 0; i < value.length(); i++) {
                    char c = value.charAt(i);
                    // trivial case: single quote must not be escaped
                    if (c == '\'') {
                        result.append("'");
                        continue;
                    }
                    // trivial case: double quotes must be escaped
                    if (c == '\"') {
                        result.append("\\\"");
                        continue;
                    }
                    // default case: just let character literal do its work
                    result.append(characterLiteral(c));
                }
                if (++s < values.length)
                    result.append("\", ");
                else
                    result.append('"');
            }
            else
            {
                if (s + 1 < values.length)
                    result.append(values[s++]).append(", ");
                else
                    result.append(values[s++]);
            }
        }
        return result.toString();
    }
    /**
     * Returns the string literals, separated by ", " representing {@code values}, including wrapping double quotes.
     * From CodePoet source (com.squareup.javapoet.Util), with small changes.
     * @param values the values to escape as a String
     * @return the string literal representing {@code value}, including wrapping double quotes and comma separators.
     */
    private static String stringLiterals(int alternationCode, ClassName cross1, ClassName cross2, int lineLength, String... values) {
        StringBuilder result = new StringBuilder(values.length * 8),
                work = new StringBuilder(40 + lineLength);
        int latestBreak = 0;
        String value;
        for (int s = 0; s < values.length;) {
            value = values[s];
            if(value == null || value.isEmpty()) {
                ++s;
                continue;
            }
            if((cross2 == null || (s & 1) == 0) && !VOI.equals(cross1)) {
                work.setLength(0);
                work.append(cross1.simpleName()).append(".get(\"").append(value).append("\")");
                if (++s < values.length) {
                    work.append(",");
                    if(result.length() + work.length() + 1 - latestBreak < lineLength)
                        result.append(work).append(' ');
                    else
                    {
                        latestBreak = result.length();
                        result.append(work).append('\n');
                    }
                } else {
                    result.append(work);
                }
            }
            else if((s & 1) == 1 && cross2 != null && !VOI.equals(cross2)){
                work.setLength(0);
                work.append(cross2.packageName()).append('.').append(cross2.simpleName()).append(".get(\"").append(value).append("\")");
                if (++s < values.length) {
                    work.append(",");
                    if(result.length() + work.length() + 1 - latestBreak < lineLength)
                        result.append(work).append(' ');
                    else
                    {
                        latestBreak = result.length();
                        result.append(work).append('\n');
                    }
                } else {
                    result.append(work);
                }
            }
            else if(alternationCode >= 2 || (s & 1) == alternationCode) {
                work.setLength(0);
                work.append('"');
                for (int i = 0; i < value.length(); i++) {
                    char c = value.charAt(i);
                    // trivial case: single quote must not be escaped
                    if (c == '\'') {
                        work.append("'");
                        continue;
                    }
                    // trivial case: double quotes must be escaped
                    if (c == '\"') {
                        work.append("\\\"");
                        continue;
                    }
                    // default case: just let character literal do its work
                    work.append(characterLiteral(c));
                }
                if (++s < values.length) {
                    work.append("\",");
                    if(result.length() + work.length() + 1 - latestBreak < lineLength)
                        result.append(work).append(' ');
                    else
                    {
                        latestBreak = result.length();
                        result.append(work).append('\n');
                    }
                } else {
                    result.append(work).append('"');
                }
            }
            else
            {
                if (++s < values.length) {
                    if (result.length() + value.length() + 2 - latestBreak < lineLength)
                        result.append(value).append(", ");
                    else if (result.length() + value.length() + 1 - latestBreak < lineLength)
                    {
                        result.append(value).append(',');
                        latestBreak = result.length();
                        result.append('\n');
                    }
                    else {
                        latestBreak = result.length();
                        result.append(value).append(",\n");
                    }
                } else {
                    result.append(value);
                }
            }
        }
        return result.toString();
    }

    /**
     * Makes a LinkedHashMap (LHM) with key and value types inferred from the types of k0 and v0, and considers all
     * parameters key-value pairs, casting the Objects at positions 0, 2, 4... etc. to K and the objects at positions
     * 1, 3, 5... etc. to V. If rest has an odd-number length, then it discards the last item. If any pair of items in
     * rest cannot be cast to the correct type of K or V, then this inserts nothing for that pair.
     * @param k0 the first key; used to infer the types of other keys if generic parameters aren't specified.
     * @param v0 the first value; used to infer the types of other values if generic parameters aren't specified.
     * @param rest an array or vararg of keys and values in pairs; should contain alternating K, V, K, V... elements
     * @param <K> the type of keys in the returned LinkedHashMap; if not specified, will be inferred from k0
     * @param <V> the type of values in the returned LinkedHashMap; if not specified, will be inferred from v0
     * @return a freshly-made LinkedHashMap with K keys and V values, using k0, v0, and the contents of rest to fill it
     */
    @SuppressWarnings("unchecked")
    public static <K, V> LinkedHashMap<K, V> makeMap(K k0, V v0, Object... rest)
    {
        if(rest == null || rest.length == 0)
        {
            LinkedHashMap<K, V> lhm = new LinkedHashMap<>(2);
            lhm.put(k0, v0);
            return lhm;
        }
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>(1 + (rest.length / 2));
        lhm.put(k0, v0);

        for (int i = 0; i < rest.length - 1; i+=2) {
            try {
                lhm.put((K) rest[i], (V) rest[i + 1]);
            }catch (ClassCastException ignored) {
            }
        }
        return lhm;
    }
}
