package com.github.tommyettinger.tablab;

import org.junit.Test;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReaderTest {
    private String input = "Job\nname:str\tdescription:str\toffense:int\tdefense:int\n" +
            "Abjurer\tA defensive mage\t1\t9\n" +
            "Ninja\tA nimble assassin\t9\t1\n";

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
        CodeWriter writer = new CodeWriter("com.github.tommyettinger.tablab.generated");
        System.out.println(writer.write(reader));

    }
}
