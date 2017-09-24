package com.github.tommyettinger.tablab;

import org.junit.Test;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class ReaderTest {
    @Test
    public void testBasics()
    {
        String input = "name:String\tdescription:String\toffense:int\tdefense:int\n" +
                "Abjurer\tA defensive mage\t1\t9\n" +
                "Ninja\tA nimble assassin\t9\t1";
        Reader reader = new Reader();
        reader.read(input);
        System.out.println(StringKit.join(", ", reader.headerLine));
        System.out.println();
        for (int i = 0; i < reader.contentLines.length; i++) {
            System.out.println(StringKit.join(", ", reader.contentLines[i]));
        }
    }
}
