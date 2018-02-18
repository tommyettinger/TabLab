package com.github.tommyettinger.tablab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Tommy Ettinger on 9/27/2017.
 */
public class MainApplication {

    public static void main(String[] args) {
        if (args == null || args.length < 1)
            return;
        String toolsPackage = null, toolsClass = null, numbersPackage = "java.lang", numbersClass = "Double";
        for (int i = 0; i < args.length; i++) {
            if(args[i].startsWith("--"))
            {
                if(args[i].equalsIgnoreCase("--SquidLib"))
                {
                    numbersPackage = toolsPackage = "squidpony.squidmath";
                    toolsClass = "OrderedMap";
                    numbersClass = "NumberTools";
                }

                args[i] = null;
            }
        }
        String inputName = StringKit.join(" ", args);
        try {
            TSVReader reader = new TSVReader();
            Path path = Paths.get(inputName);
            reader.read(path.getFileName().toString(), Files.readAllLines(path));
            CodeWriter writer = new CodeWriter(toolsPackage, toolsClass, numbersPackage, numbersClass);
            System.out.println(writer.write(reader));
            writer.writeTo(reader, new File(""));
        }catch (IOException ignored){}
    }
}
