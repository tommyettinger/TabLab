package com.github.tommyettinger.tablab;

import regexodus.Pattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReader {
    public String[] headerLine;
    public String[] allLines;
    public String[][] contentLines;
    public String packageName;
    public String name;
    public TSVReader()
    {
    }
    public void read(String text)
    {
        read(Pattern.compile("\\V+").matcher(text).foundStrings());
    }
    public void read(List<String> allLines)
    {
        //allLines = text.split("\r\n|[\n-\r\u0085\u2028\u2029]");
        String line = allLines.get(0);
        int idx = line.lastIndexOf('.');
        packageName = StringKit.safeSubstring(line, 0, idx);
        name = StringKit.safeSubstring(line, idx+1, StringKit.indexOf(line, StringKit.whitespacePattern));
        headerLine = StringKit.split(allLines.get(1), "\t");
        contentLines = new String[allLines.size() - 2][headerLine.length];
        String temp;
        for (int i = 0; i < contentLines.length; i++) {
            temp = allLines.get(i+2);
            idx = -1;
            for (int j = 0; j < headerLine.length - 1; j++) {
                contentLines[i][j] = StringKit.safeSubstring(temp, idx+1, idx = temp.indexOf('\t', idx+1));
            }
            contentLines[i][headerLine.length-1] = temp.substring(idx+1);
        }
    }

    public void readFile(String filename)
    {
        try {
            read(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            System.err.println("Could not read file (check that path is correct): " + filename);
        }
    }
}
