package com.github.tommyettinger.tablab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Tommy Ettinger on 9/27/2017.
 */
public class MainApplication {

    public static void main(String[] args) {
        if (args == null || args.length < 1)
            return;
        String tools = null, toolsClass = null;
        for (int i = 0; i < args.length; i++) {
            if(args[i].startsWith("--"))
            {
                if(args[i].equalsIgnoreCase("--SquidLib"))
                {
                    tools = "squidpony.squidmath";
                    toolsClass = "OrderedMap";
                }

                args[i] = null;
            }
        }
        String inputName = StringKit.join(" ", args);
        try {
            TSVReader reader = new TSVReader();
            reader.read(Files.readAllLines(Paths.get(inputName)));
            CodeWriter writer = new CodeWriter(tools, toolsClass);
            System.out.println(writer.write(reader));
            writer.writeTo(reader, new File(""));
        }catch (IOException ignored){}
    }
}
