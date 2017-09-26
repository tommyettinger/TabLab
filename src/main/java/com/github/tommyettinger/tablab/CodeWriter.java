package com.github.tommyettinger.tablab;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class CodeWriter
{
    public String packageName = "tab.lab.generated";
    public CodeWriter()
    {
    }
    public CodeWriter(String packageName)
    {
        this.packageName = packageName;
    }
    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final TypeName STR = TypeName.get(String.class);
    public static final HashMap<String, TypeName> typenames = new HashMap<>(32);
    static {
        typenames.put("String", STR);
        typenames.put("str", STR);
        typenames.put("bool", TypeName.BOOLEAN);
        typenames.put("boolean", TypeName.BOOLEAN);
        typenames.put("char", TypeName.CHAR);
        typenames.put("int", TypeName.INT);
        typenames.put("long", TypeName.LONG);
        typenames.put("float", TypeName.FLOAT);
        typenames.put("double", TypeName.DOUBLE);
        typenames.put("object", TypeName.OBJECT);
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

    public void writeTo(TSVReader reader, File file)
    {
        try {
            write(reader).writeTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JavaFile write(TSVReader reader)
    {
        TypeSpec.Builder tb = TypeSpec.classBuilder(reader.name).addModifiers(mods);
        MethodSpec.Builder make = MethodSpec.constructorBuilder().addModifiers(mods);

        String section, field;
        int fieldCount = reader.headerLine.length;
        TypeName typename;
        TypeName[] typenameFields = new TypeName[fieldCount];
        boolean[] stringFields = new boolean[fieldCount];
        String[] arraySeparators = new String[fieldCount];
        for (int i = 0; i < fieldCount; i++) {
            section = reader.headerLine[i];
            int colon = section.indexOf(':'), typeLen = section.indexOf('[');
            if(typeLen < 0) {
                typeLen = section.length();
                typename = typenames.getOrDefault(section.substring(colon + 1, typeLen), STR);
                stringFields[i] = typename.equals(STR);
            }
            else {
                typename = typenames.getOrDefault(section.substring(colon + 1, typeLen), STR);
                stringFields[i] = typename.equals(STR);
                typename = ArrayTypeName.of(typename);
                arraySeparators[i] = section.substring(typeLen+1, section.indexOf(']'));
            }
            typenameFields[i] = typename;
            field = section.substring(0, colon);
            tb.addField(typename, field, mods);
            make.addParameter(typename, field).addStatement("this.$N = $N", field, field);
        }
        tb.addMethod(make.build());
        ClassName cn = ClassName.get(packageName, reader.name);
        ArrayTypeName atn = ArrayTypeName.of(cn);
        CodeBlock.Builder cbb = CodeBlock.builder();
        cbb.beginControlFlow("new $T", atn);
        for (int i = 0; i < reader.contentLines.length; i++) {
            cbb.add("new $T(", cn);
            int j = 0;
            for (; j < fieldCount; j++) {
                if(stringFields[j])
                {
                    if(arraySeparators[j] != null)
                        cbb.add("new $T {$L}", typenameFields[j],
                                stringLiteral(reader.contentLines[i][j].replace(
                                        arraySeparators[j], "\uFEFF, \uFEFF")).replace('\ufeff', '\"'));
                    else
                        cbb.add("$S", reader.contentLines[i][j]);
                }
                else if(arraySeparators[j] != null)
                    cbb.add("new $T {$L}", typenameFields[i], reader.contentLines[i][j].replace(arraySeparators[j], ", "), "");
                else
                    cbb.add("$L", reader.contentLines[i][j]);
                if(j < fieldCount - 1)
                    cbb.add(", ");
            }

            cbb.add("),\n");
        }
        cbb.unindent();
        cbb.add("}");

        tb.addField(FieldSpec.builder(atn, "ENTRIES", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer(cbb.build()).build());
        TypeSpec t = tb.build();
        return JavaFile.builder(packageName, t).build();
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

}
