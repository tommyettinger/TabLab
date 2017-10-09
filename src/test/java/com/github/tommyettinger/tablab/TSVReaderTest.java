package com.github.tommyettinger.tablab;

import org.junit.Test;

import java.io.File;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReaderTest {
    private String input = "com.github.tommyettinger.tablab.generated.Job\n" +
            "name:str\tdescription\toffense:int\tdefense:int\ttalents:str[;;]\tskills:str{,}int\n" +
            "Abjurer\tA defensive mage\t1\t9\tHaze;;Warding Tome\tMist Shackles,1,Barricade,2,Stony Shield,3,Body of Iron,1\n" +
            "Ninja\tA nimble assassin\t9\t1\tPoison;;Martial Arts\tVanish,2,Smoke Bomb,1,Shadow Dagger,2\n";

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

    @Test
    public void testFile()
    {
        TSVReader reader = new TSVReader();
        reader.readFile("src/test/resources/Weapon.txt");
        CodeWriter writer = new CodeWriter();
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));
    }
}
