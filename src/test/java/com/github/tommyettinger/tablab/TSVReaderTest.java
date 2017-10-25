package com.github.tommyettinger.tablab;

import org.junit.Test;

import java.io.File;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReaderTest {
    private String talents = "com.github.tommyettinger.tablab.generated.Talent\tname\n" +
            "name\tdescription\n" +
            "Haze\tYour presence clouds the minds of enemies, decreasing their Accuracy.\n" +
            "Warding Tome\tCarrying a Spellbook sharply increases your Defense.\n" +
            "Poison\tWhen your attacks deal damage, half that damage is dealt again in one round.\n" +
            "Martial Arts\tYou are immune to the Inaction condition.\n";
    private String jobs = "com.github.tommyettinger.tablab.generated.Job\tname\n" +
            "name:str\tdescription\toffense:int\tdefense:int\ttalents:Talent[;;]\tskills:str{,}int\n" +
            "Abjurer\tA defensive mage\t1\t9\tHaze;;Warding Tome\tMist Shackles,1,Barricade,2,Stony Shield,3,Body of Iron,1\n" +
            "Ninja\tA nimble assassin\t9\t1\tPoison;;Martial Arts\tVanish,2,Smoke Bomb,1,Shadow Dagger,2\n";

    @Test
    public void testBasics()
    {
        TSVReader reader = new TSVReader();
        reader.read(jobs);
        System.out.println(reader.name);
        System.out.println(StringKit.join(", ", reader.headerLine));
        System.out.println();
        for (int i = 0; i < reader.contentLines.length; i++) {
            System.out.println(StringKit.join("... ", reader.contentLines[i]));
        }
    }
    @Test
    public void testWriter()
    {
        TSVReader reader = new TSVReader();
        CodeWriter writer = new CodeWriter();
        reader.read(talents);
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));
        reader.read(jobs);
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
