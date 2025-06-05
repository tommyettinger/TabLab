package com.github.tommyettinger.tablab;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class CodeWriterJdkgdxds
{
    public String toolsPackage = "com.github.tommyettinger.ds";
    public String toolsClass = "ObjectObjectOrderedMap";
    public String makeMethod = "with";
    public ClassName mapClass = ClassName.get(toolsPackage, toolsClass);
    public CodeWriterJdkgdxds()
    {
    }
    public CodeWriterJdkgdxds(String toolsPackage, String toolsClass, String maker)
    {
        this();
    }

    private final Modifier[] mods = {Modifier.PUBLIC};
    private final TypeName STR = TypeName.get(String.class);
    private final ParameterizedTypeName JUNC = ParameterizedTypeName.get(ClassName.get(toolsPackage, "Junction"), STR);
    private final ClassName VOI = ClassName.get(Void.class);
    public final HashMap<String, TypeName> typenames = new HashMap<>(32);
    public final HashMap<TypeName, TypeName> maps = new HashMap<>(32);
    public final HashMap<TypeName, String> defaults = new HashMap<>(32);
    {
        typenames.put("String", STR);
        typenames.put("str", STR);
        typenames.put("s", STR);
        typenames.put("", STR);
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
        typenames.put("Junction", JUNC);
        typenames.put("j", JUNC);
        typenames.put("Object", TypeName.OBJECT);
        typenames.put("object", TypeName.OBJECT);
        typenames.put("o", TypeName.OBJECT);
        defaults.put(STR, "\"\"");
        defaults.put(TypeName.BOOLEAN, "false");
        defaults.put(TypeName.CHAR, "' '");
        defaults.put(TypeName.INT, "0");
        defaults.put(TypeName.LONG, "0L");
        defaults.put(TypeName.FLOAT, "0.0f");
        defaults.put(TypeName.DOUBLE, "0.0");
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.OBJECT, TypeName.FLOAT.box()),
                ParameterizedTypeName.get(ClassName.get(toolsPackage, "ObjectFloatOrderedMap"), TypeName.OBJECT));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.OBJECT, TypeName.LONG.box()),
                ParameterizedTypeName.get(ClassName.get(toolsPackage, "ObjectLongOrderedMap"), TypeName.OBJECT));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.OBJECT, TypeName.INT.box()),
                ParameterizedTypeName.get(ClassName.get(toolsPackage, "ObjectIntOrderedMap"), TypeName.OBJECT));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.LONG.box(), TypeName.OBJECT),
                ParameterizedTypeName.get(ClassName.get(toolsPackage, "LongObjectOrderedMap"), TypeName.OBJECT));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.LONG.box(), TypeName.FLOAT.box()),
                (ClassName.get(toolsPackage, "LongFloatOrderedMap")));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.LONG.box(), TypeName.LONG.box()),
                (ClassName.get(toolsPackage, "LongLongOrderedMap")));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.LONG.box(), TypeName.INT.box()),
                (ClassName.get(toolsPackage, "LongIntOrderedMap")));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.INT.box(), TypeName.OBJECT),
                ParameterizedTypeName.get(ClassName.get(toolsPackage, "IntObjectOrderedMap"), TypeName.OBJECT));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.INT.box(), TypeName.FLOAT.box()),
                (ClassName.get(toolsPackage, "IntFloatOrderedMap")));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.INT.box(), TypeName.LONG.box()),
                (ClassName.get(toolsPackage, "IntLongOrderedMap")));
        maps.put(ParameterizedTypeName.get(mapClass, TypeName.INT.box(), TypeName.INT.box()),
                (ClassName.get(toolsPackage, "IntIntOrderedMap")));
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TypeName extract(TypeName tn) {
        return (tn instanceof ParameterizedTypeName) ? ((ParameterizedTypeName)tn).rawType : tn;
    }

    public JavaFile write(TSVReader reader)
    {
        String packageName = "generated.tablab";
        ClassName tlt;
        TypeSpec.Builder tb = TypeSpec.classBuilder(reader.name).addModifiers(mods);
//        tb.addSuperinterface(Serializable.class);
//        tb.addField(FieldSpec.builder(TypeName.LONG, "serialVersionUID", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer("1L").build());
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
        boolean[] junctionFields = new boolean[fieldCount];
        boolean[] junctionExtras = new boolean[fieldCount];
        ClassName[] crossFields = new ClassName[fieldCount];
        ClassName[] crossExtras = new ClassName[fieldCount];
        String[] arraySeparators = new String[fieldCount];
        String[] extraSeparators = new String[fieldCount];
        String[] fieldNames = new String[fieldCount];
        ParameterizedTypeName mappingTypename = null;
        int mappingKeyIndex = -1;
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
                    crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1)) ? VOI : ClassName.get(packageName, tmp);
                    typename = colon < 0 ? STR : typenames.getOrDefault(tmp, crossFields[i]);
                    if(stringFields[i] = typename.equals(STR))
                        reader.keyColumn = colon < 0 ? section : section.substring(0, colon);
                    junctionFields[i] = typename.equals(JUNC);

                } else {
                    if (colon < 0)
                    {
                        crossFields[i] = VOI;
                        typename = STR;
                        stringFields[i] = true;
                        if(reader.keyColumn == null)
                            reader.keyColumn = section;
                    }
                    else {
                        crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1)) ? VOI : ClassName.get(packageName, tmp);
                        typename = typenames.getOrDefault(tmp, crossFields[i]);
                        if(stringFields[i] = typename.equals(STR))
                            reader.keyColumn = section.substring(0, colon);
                        junctionFields[i] = typename.equals(JUNC);
                    }
                }
            }
            else if(arrayStart >= 0 && mapStart >= 0) { // map case, array values
                crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, mapStart)) ? VOI : ClassName.get(packageName, tmp);
                typenameExtras1[i] = typenameExtra1 = typenames.getOrDefault(tmp, crossFields[i]).box();
                crossExtras[i] = typenames.containsKey(tmp = section.substring(mapEnd + 1, arrayStart)) ? VOI : ClassName.get(packageName, tmp);
                typenameExtra2 = typenames.getOrDefault(tmp, crossExtras[i]);
                stringFields[i] = typenameExtra1.equals(STR);
                stringExtras[i] = typenameExtra2.equals(STR);
                junctionFields[i] = typenameExtra1.equals(JUNC);
                junctionExtras[i] = typenameExtra2.equals(JUNC);
                typenameExtras2[i] = typenameExtra2 = ArrayTypeName.of(typenameExtra2);
                typename = ParameterizedTypeName.get(mapClass, typenameExtra1, typenameExtra2);
                arraySeparators[i] = section.substring(mapStart+1, mapEnd);
                extraSeparators[i] = section.substring(arrayStart+1, section.indexOf(']'));

            }
            else if(arrayStart >= 0) {
                crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, arrayStart)) ? VOI : ClassName.get(packageName, tmp);
                typename = typenames.getOrDefault(tmp, crossFields[i]);
                stringFields[i] = typename.equals(STR);
                junctionFields[i] = typename.equals(JUNC);
                typename = ArrayTypeName.of(typename);
                arraySeparators[i] = section.substring(arrayStart+1, section.indexOf(']'));
            }
            else { // map case
                crossFields[i] = typenames.containsKey(tmp = section.substring(colon + 1, mapStart)) ? VOI : ClassName.get(packageName, tmp);
                typenameExtras1[i] = typenameExtra1 = typenames.getOrDefault(tmp, crossFields[i]).box();
                crossExtras[i] = typenames.containsKey(tmp = section.substring(mapEnd + 1)) ? VOI : ClassName.get(packageName, tmp);
                typenameExtras2[i] = typenameExtra2 = typenames.getOrDefault(tmp, crossExtras[i]).box();
                stringFields[i] = typenameExtra1.equals(STR);
                stringExtras[i] = typenameExtra2.equals(STR);
                junctionFields[i] = typenameExtra1.equals(JUNC);
                junctionExtras[i] = typenameExtra2.equals(JUNC);
                TypeName alternate = ParameterizedTypeName.get(mapClass,
                        (typenameExtra1.isBoxedPrimitive() ? typenameExtra1 : TypeName.OBJECT),
                        (typenameExtra2.isBoxedPrimitive() ? typenameExtra2 : TypeName.OBJECT));
                if(maps.containsKey(alternate)) {
                    TypeName tn = maps.get(alternate);
                    if (tn instanceof ParameterizedTypeName) {
//                        typename = ((ParameterizedTypeName) tn).rawType;
                        ArrayList<TypeName> extras = new ArrayList<>(2);
                        if (!typenameExtra1.isBoxedPrimitive())
                            extras.add(typenameExtra1);
                        if (!typenameExtra2.isBoxedPrimitive())
                            extras.add(typenameExtra2);
                        typename = ParameterizedTypeName.get(((ParameterizedTypeName)tn).rawType, extras.toArray(new TypeName[0]));
                    } else typename = tn;
                }
                else
                    typename = ParameterizedTypeName.get(mapClass, typenameExtra1, typenameExtra2);

                arraySeparators[i] = section.substring(mapStart+1, mapEnd);
            }
            typenameFields[i] = typename;
            field = StringKit.safeSubstring(section, 0, colon);
            tb.addField(typename, field, mods);
            fieldNames[i] = field;
            if(field.equals(reader.keyColumn) && typename.equals(STR) && mappingKeyIndex < 0) {
                if (typeLen < 0) {
                    mappingTypename = ParameterizedTypeName.get(mapClass, STR, myName);
                    mappingKeyIndex = i;
                }
            }
            make.addParameter(typename, field).addStatement("this.$N = $N", field, field);
        }
        tb.addField(TypeName.LONG, "__code", Modifier.PRIVATE);
        make.addParameter(TypeName.LONG, "__code").addStatement("this.__code = __code");
        tb.addMethod(make.build());
        ClassName cn = ClassName.get(packageName, reader.name);
        makeHashCode(tb);
//        makeHashCode(tb, fieldNames, typenameFields);
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
                    if (extraSeparators[j] != null) { // a map with array values
                        if (!reader.contentLines[i][j].contains(arraySeparators[j]))
                        {
                            if(typenameExtras1[j].isBoxedPrimitive() && typenameExtras2[j].isBoxedPrimitive())
                                cbb.add("$T.$L()", extract(typenameFields[j]), typenameExtras1[j], typenameExtras2[j], makeMethod);
                            else if(typenameExtras1[j].isBoxedPrimitive())
                                cbb.add("$T.<$T>$L()", extract(typenameFields[j]), typenameExtras2[j], makeMethod);
                            else if(typenameExtras2[j].isBoxedPrimitive())
                                cbb.add("$T.<$T>$L()", extract(typenameFields[j]), typenameExtras1[j], makeMethod);
                            else
                                cbb.add("$T.<$T, $T>$L()", extract(typenameFields[j]), typenameExtras1[j], typenameExtras2[j], makeMethod);
                        }
                        else
                            cbb.add("$T.$L($L)", extract(typenameFields[j]), makeMethod,
                                    stringMapArrayLiterals((stringFields[j] ? 0 : -1), crossFields[j], crossExtras[j], 80,
                                            reader.contentLines[i][j], arraySeparators[j], extraSeparators[j], typenameExtras2[j]));
                    } else if (arraySeparators[j] != null) {
                        if (typenameExtras1[j] != null) {
                            if (!reader.contentLines[i][j].contains(arraySeparators[j])) {
                                if(typenameExtras1[j].isBoxedPrimitive() && typenameExtras2[j].isBoxedPrimitive())
                                    cbb.add("$T.$L()", extract(typenameFields[j]), typenameExtras1[j], typenameExtras2[j], makeMethod);
                                else if(typenameExtras1[j].isBoxedPrimitive())
                                    cbb.add("$T.<$T>$L()", extract(typenameFields[j]), typenameExtras2[j], makeMethod);
                                else if(typenameExtras2[j].isBoxedPrimitive())
                                    cbb.add("$T.<$T>$L()", extract(typenameFields[j]), typenameExtras1[j], makeMethod);
                                else
                                    cbb.add("$T.<$T, $T>$L()", extract(typenameFields[j]), typenameExtras1[j], typenameExtras2[j], makeMethod);

                            } else
                                cbb.add("$T.$L($L)", extract(typenameFields[j]), makeMethod,
                                        stringLiterals((stringFields[j] ? 1 : 0) + (stringExtras[j] ? 2 : 0) - 1, crossFields[j], crossExtras[j], 80,
                                                StringKit.split(reader.contentLines[i][j], arraySeparators[j])));
                        } else {
                            cbb.add("new $T {$L}", typenameFields[j],
                                    stringLiterals((stringFields[j] ? 2 : -1), crossFields[j], null,
                                            80, StringKit.split(reader.contentLines[i][j], arraySeparators[j])));
                        }
                    } else if (junctionFields[j] || junctionExtras[j]) {
                        cbb.add("$T.parse($L)", JUNC.rawType, stringLiteral(reader.contentLines[i][j], crossFields[j]));
                    } else if (stringFields[j] || stringExtras[j] || !VOI.equals(crossFields[j])) {
                        cbb.add("$L", stringLiteral(reader.contentLines[i][j], crossFields[j]));
                    } else {
                        cbb.add("$L", reader.contentLines[i][j].isEmpty()
                                ? Objects.toString(defaults.get(typenameFields[j]))
                                : bareLiteral(reader.contentLines[i][j], typenameFields[j]));
                    }
//                    if (j < fieldCount - 1)
                    cbb.add(", ");
                }

                cbb.add("$LL", hash64(forward(reader.name.hashCode()), reader.contentLines[i]));
                
                cbb.add("),\n");
                
            }
            cbb.unindent();
            cbb.add("}");

            tb.addField(FieldSpec.builder(atn, "ENTRIES", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer(cbb.build()).build());
            if (mappingKeyIndex >= 0) {
                cbb = CodeBlock.builder();
                String[] mapStuff = new String[reader.contentLines.length * 2];
                for (int i = 0; i < reader.contentLines.length; i++) {
                    mapStuff[i * 2] = reader.contentLines[i][mappingKeyIndex];
                    mapStuff[i * 2 + 1] = "ENTRIES[" + i + "]";
                }
                cbb.add("$T.$L(\n$L)", tlt, makeMethod, stringLiterals(0, VOI, VOI, 80, mapStuff)); // alternationCode: (stringFields[mappingKeyIndex] ? 0 : -1)
                tb.addField(FieldSpec.builder(mappingTypename, "MAPPING", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer(cbb.build()).build());
                MethodSpec.Builder mb = MethodSpec.methodBuilder("get").addModifiers(Modifier.PUBLIC, Modifier.STATIC).returns(myName).addParameter(STR, "item").addCode("return MAPPING.get($N);\n", "item");
                tb.addMethod(mb.build());
            }
        }
        return JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build();
    }

    private String bareLiteral(String s, TypeName type) {
        if(TypeName.CHAR.equals(type))
            return "'" + s + "'";
        if(TypeName.LONG.equals(type))
            return s + "L";
        if(TypeName.FLOAT.equals(type))
            return s + "f";
        return s;

    }
    /**
     * A long constant used as a multiplier by the MX3 unary hash.
     * Used in {@link #mix(long)} and {@link #mixStream(long, long)}, as well as when hashing one Object.
     */
    public static final long C = 0xBEA225F9EB34556DL;
    /**
     * A 64-bit probable prime, found with {@link java.math.BigInteger#probablePrime(int, Random)}.
     */
    public static final long Q = 0xD1B92B09B92266DDL;
    /**
     * A 64-bit probable prime, found with {@link java.math.BigInteger#probablePrime(int, Random)}.
     */
    public static final long R = 0x9995988B72E0D285L;
    /**
     * A 64-bit probable prime, found with {@link java.math.BigInteger#probablePrime(int, Random)}.
     */
    public static final long S = 0x8FADF5E286E31587L;
    /**
     * A 64-bit probable prime, found with {@link java.math.BigInteger#probablePrime(int, Random)}.
     */
    public static final long T = 0xFCF8B405D3D0783BL;

    /**
     * A medium-quality, but fast, way to scramble a 64-bit input and get a 64-bit output.
     * <br>
     * This is reversible, which allows all outputs to be possible for the hashing functions to produce.
     * However, this also allows the seed to be recovered if a zero-length input is supplied. That's why this
     * is a non-cryptographic hashing algorithm!
     * @param x any long
     * @return any long
     */
    public static long mix(long x) {
        x ^= (x << 23 | x >>> 41) ^ (x << 43 | x >>> 21);
        x *= C;
        return x ^ (x << 11 | x >>> 53) ^ (x << 50 | x >>> 14);
    }

    /**
     * A low-to-medium-quality and fast way to combine two 64-bit inputs to get one 64-bit result.
     * <br>
     * This is not reversible unless you know one of the parameters in full.
     * @param h any long, typically a counter; will be scrambled much less
     * @param x any long, typically an item being hashed; will be scrambled much more
     * @return any long
     */
    public static long mixStream(long h, long x) {
        x *= C;
        x ^= x >>> 39;
        return (x * C + h) * C;
    }

    /**
     * Performs part of the hashing step applied to four 64-bit inputs at once, and typically added to a running
     * hash value directly.
     * <br>
     * This is not reversible under normal circumstances. It may be possible to recover one parameter if the other three
     * are known in full. This uses four 64-bit primes as multipliers; the exact numbers don't matter as long as
     * they are odd and have sufficiently well-distributed bits (close to 32 '1' bits, and so on). If this is only
     * added to a running total, the result won't have very random low-order bits, so performing bitwise rotations
     * after at least some calls to this (or xorshifting right) is critical to keeping the hash high-quality.
     * @param a any long, typically an item being hashed; mixed with b and d
     * @param b any long, typically an item being hashed; mixed with c and a
     * @param c any long, typically an item being hashed; mixed with d and b
     * @param d any long, typically an item being hashed; mixed with a and c
     * @return any long
     */
    public static long mixStreamBulk(long a, long b, long c, long d) {
        return ((a << 28 | a >>> 36) + b) * Q
                + ((b << 29 | b >>> 35) + c) * R
                + ((c << 27 | c >>> 37) + d) * S
                + ((d << 25 | d >>> 39) + a) * T;
    }


    /**
     * A very minimalist way to scramble inputs to be used as seeds.
     * This simply performs the XOR-rotate-XOR-rotate operation on x, using left rotations of 29 and 47.
     * @param x any long
     * @return a slightly scrambled version of x
     */
    public static long forward(long x) {
        return x ^ (x << 29 | x >>> 35) ^ (x << 47 | x >>> 17);
    }

    /**
     * A hashing function that takes any {@code long} as a seed and a CharSequence to hash, modified using the seed.
     * This produces a high-quality 64-bit hash.
     * @param seed any long seed
     * @param data input String
     * @return the 64-bit hash of data
     */
    public static long hash64(final long seed, final String[] data) {
        if (data == null)
            return 0;
        int len = data.length;
        long h = len ^ seed;
        int i = 0;
        while(len >= 8){
            len -= 8;
            h *= C;
            h += mixStreamBulk(data[i  ].hashCode(), data[i+1].hashCode(), data[i+2].hashCode(), data[i+3].hashCode());
            h = (h << 37 | h >>> 27);
            h += mixStreamBulk(data[i+4].hashCode(), data[i+5].hashCode(), data[i+6].hashCode(), data[i+7].hashCode());
            i += 8;
        }
        while(len >= 1){
            len--;
            h = mixStream(h, data[i++].hashCode());
        }
        return mix(h);
    }


    private void makeHashCode(TypeSpec.Builder tb)
    {
        tb.addMethod(MethodSpec.methodBuilder("hash64").addModifiers(Modifier.PUBLIC).returns(TypeName.LONG).addStatement("return __code").build());
        tb.addMethod(MethodSpec.methodBuilder("hashCode").addModifiers(mods).returns(TypeName.INT).addStatement("return (int)__code").build());
    }
    private void makeEquals(TypeSpec.Builder tb, ClassName cn, String[] fieldNames, TypeName[] fieldTypes)
    {
        TypeName tn, arrays = TypeName.get(Arrays.class), objects = TypeName.get(Objects.class);
        tb.addMethod(MethodSpec.methodBuilder("stringArrayEquals").addModifiers(Modifier.PRIVATE, Modifier.STATIC).returns(TypeName.BOOLEAN).addParameter(ArrayTypeName.of(STR), "left").addParameter(ArrayTypeName.of(STR), "right")
                .addCode("if (left == right) return true;\n" +
                        "if (left == null || right == null) return false;\n" +
                        "final int len = left.length;\n" +
                        "if(len != right.length) return false;\n" +
                        "for (int i = 0; i < len; i++) { if(!$T.equals(left[i], right[i])) return false; }\n" +
                        "return true;\n", objects).build());

        MethodSpec.Builder mb = MethodSpec.methodBuilder("equals").addModifiers(Modifier.PUBLIC).returns(TypeName.BOOLEAN).addParameter(TypeName.OBJECT, "o");
        mb.addCode("if (this == o) return true;\nif (o == null || getClass() != o.getClass()) return false;\n$T other = ($T) o;\n", cn, cn);
        int len = Math.min(fieldNames.length, fieldTypes.length);
        String fn;
        for (int i = 0; i < len; i++) {
            fn = fieldNames[i];
            tn = fieldTypes[i];
            if(fn == null || fn.isEmpty()) continue;
            if(tn.isPrimitive())
            {
                mb.addStatement("if ($N != other.$N) return false", fn, fn);
            }
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
                mb.addStatement("if (!$T.equals($N, other.$N)) return false", objects, fn, fn);
            }
        }
        mb.addStatement("return true");
        tb.addMethod(mb.build());
    }

    private static String characterLiteral(char c) {
        // see https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6
        switch (c) {
            case '\b': return "\\b";  /* \\u0008: backspace (BS) */
            case '\t': return "\\t";  /* \\u0009: horizontal tab (HT) */
            case '\n': return "\\n";  /* \\u000a: linefeed (LF) */
            case '\f': return "\\f";  /* \\u000c: form feed (FF) */
            case '\r': return "\\r";  /* \\u000d: carriage return (CR) */
            case '\"': return "\"";   /* \\u0022: double quote (") */
            case '\'': return "\\'";  /* \\u0027: single quote (') */
            case '\\': return "\\\\"; /* \\u005c: backslash (\) */
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
    private String stringLiteral(String value, ClassName cross1) {
        StringBuilder result = new StringBuilder(value.length() + 2);
        if(!VOI.equals(cross1) && !STR.equals(cross1)) {
            result.append(cross1.simpleName()).append(".get(\"").append(value).append("\")");
        }
        else {
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
        }
        return result.toString();
    }
    /**
     * Returns the string literals, separated by ", " representing {@code values}, including wrapping double quotes.
     * From CodePoet source (com.squareup.javapoet.Util), with small changes.
     * @param values the values to escape as a String
     * @return the string literals representing {@code values}, including wrapping double quotes and comma separators.
     */
    private String stringLiterals(String... values) {
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
     * @return the string literals representing {@code values}, including wrapping double quotes and comma separators.
     */
    private String stringLiterals(int alternationCode, String... values) {
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
    private String stringLiterals(int alternationCode, ClassName cross1, ClassName cross2, int lineLength, String... values) {
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

    private String stringMapArrayLiterals(int alternationCode, ClassName cross1, ClassName cross2, int lineLength,
                                          String content, String majorSeparator, String minorSeparator, TypeName valueType) {
        String[] values = StringKit.split(content, majorSeparator);
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
            else if(alternationCode == 0 && (s & 1) == alternationCode) {
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
                if((s & 1) == 1)
                    value = CodeBlock.of("new $T {$L}", valueType,
                            stringLiterals(alternationCode >= 1 ? 2 : -1, cross2, null, 80,
                                    StringKit.split(value, minorSeparator))).toString();
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
