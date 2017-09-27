package com.github.tommyettinger.tablab;

import org.junit.Test;

import java.io.File;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReaderTest {
    private String input = "com.github.tommyettinger.tablab.generated.Job\n" +
            "name:str\tdescription:str\toffense:int\tdefense:int\tskills:str[;;]\tranks:int[,]\n" +
            "Abjurer\tA defensive mage\t1\t9\tHaze;;Mist Shackles;;Barricade;;Stony Shield;;Body of Iron\t3,1,2,3,1\n" +
            "Ninja\tA nimble assassin\t9\t1\tVanish;;Poison;;Smoke Bomb;;Ninjutsu\t4,2,1,3\n";

    @Test
    public void testBasics()
    {
        TSVReader reader = new TSVReader();
        reader.read(input);
        System.out.println(reader.name);
        System.out.println(StringKit.join(", ", reader.headerLine));
        System.out.println();
        for (int i = 0; i < reader.contentLines.length; i++) {
            System.out.println(StringKit.join(", ", reader.contentLines[i]));
        }
    }
    @Test
    public void testWriter()
    {
        TSVReader reader = new TSVReader();
        reader.read(input);
        CodeWriter writer = new CodeWriter();
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));

    }
}
