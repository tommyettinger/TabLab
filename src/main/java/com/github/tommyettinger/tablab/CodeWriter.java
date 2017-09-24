package com.github.tommyettinger.tablab;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
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
    public static final HashMap<String, TypeName> typenames = new HashMap<>(32);
    static {
        typenames.put("String", TypeName.get(String.class));
        typenames.put("str", typenames.get("String"));
        typenames.put("bool", TypeName.BOOLEAN);
        typenames.put("boolean", TypeName.BOOLEAN);
        typenames.put("char", TypeName.CHAR);
        typenames.put("int", TypeName.INT);
        typenames.put("long", TypeName.LONG);
        typenames.put("float", TypeName.FLOAT);
        typenames.put("double", TypeName.DOUBLE);
        typenames.put("object", TypeName.OBJECT);
    }
    public String write(TSVReader reader)
    {
        TypeSpec.Builder tb = TypeSpec.classBuilder(reader.name).addModifiers(mods);
        MethodSpec.Builder make = MethodSpec.constructorBuilder().addModifiers(mods);

        String section, field;
        TypeName typename;
        for (int i = 0; i < reader.headerLine.length; i++) {
            section = reader.headerLine[i];
            int colon = section.indexOf(':');
            tb.addField(typename = typenames.getOrDefault(section.substring(colon+1), TypeName.OBJECT), field = section.substring(0, colon), mods);
            make.addParameter(typename, field).addStatement("this.$N = $N", field, field);
        }
        TypeSpec t = tb.addMethod(make.build()).build();
        return JavaFile.builder(packageName, t).build().toString();
    }
}
