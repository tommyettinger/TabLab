package com.github.tommyettinger.tablab;

import org.junit.Test;

import java.io.File;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReaderTest {
    private String talents =
            "name\tdescription\n" +
            "Haze\tYour presence clouds the minds of nearby enemies, decreasing their Accuracy.\n" +
            "Warding Tome\tCarrying a Spellbook sharply increases your Defense.\n" +
            "Destruction\tYour attacks ignore Defense from shields.\n" +
            "Poison\tWhen your attacks deal damage, half that damage is dealt again in one round.\n" +
            "Martial Arts\tYou are immune to the Inaction and Grappled conditions.\n";
    private String jobs =
            "name:str^\tdescription\toffense:int\tdefense:int\ttalents:Talent[;;]\tskills:str{,}int\n" +
            "Abjurer\tA defensive mage\t1\t9\tHaze;;Warding Tome\tMist Shackles,1,Barricade,2,Stony Shield,3,Body of Iron,1\n" +
            "Brute\tA hulking bruiser\t10\t\tDestruction\t\n" +
            "Ninja\tA nimble assassin\t9\t1\tPoison;;Martial Arts\tVanish,2,Smoke Bomb,1,Shadow Dagger,2\n";

    @Test
    public void testBasics()
    {
        TSVReader reader = new TSVReader();
        reader.read("Job", jobs);
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
        reader.read("Talent", talents);
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));
        reader.read("Job", jobs);
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));

    }

    @Test
    public void testFile()
    {
        TSVReader reader = new TSVReader();
        CodeWriter writer = new CodeWriter();
        reader.readFile("src/test/resources/Weapon.tsv");
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));
        reader.readFile("src/test/resources/MeleeWeapons.tsv");
        System.out.println(writer.write(reader));
        writer.writeTo(reader, new File("src/test/java/"));

    }
}
