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
    public String packageName = "generated";
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
        TypeName typename;
        int fieldCount = reader.headerLine.length;
        boolean[] stringFields = new boolean[fieldCount];
        for (int i = 0; i < fieldCount; i++) {
            section = reader.headerLine[i];
            int colon = section.indexOf(':');
            tb.addField(typename = typenames.getOrDefault(section.substring(colon+1), STR), field = section.substring(0, colon), mods);
            stringFields[i] = typename.equals(STR);
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
            for (; j < fieldCount - 1; j++) {
                if(stringFields[j])
                    cbb.add("$S, ", reader.contentLines[i][j]);
                else
                    cbb.add("$L, ", reader.contentLines[i][j]);
            }
            if(stringFields[j])
                cbb.add("$S", reader.contentLines[i][j]);
            else
                cbb.add("$L", reader.contentLines[i][j]);

            cbb.add("),\n");
        }
        cbb.unindent();
        cbb.add("}");

        tb.addField(FieldSpec.builder(atn, "ENTRIES", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer(cbb.build()).build());
        TypeSpec t = tb.build();
        return JavaFile.builder(packageName, t).build();
    }
}
