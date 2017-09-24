package com.github.tommyettinger.tablab;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReader {
    public String[] headerLine;
    public String[] allLines;
    public String[][] contentLines;
    public String name;
    public TSVReader()
    {
    }
    public void read(String text)
    {
        allLines = text.split("\r\n|[\n-\r\u0085\u2028\u2029]");
        name = StringKit.safeSubstring(allLines[0], 0, StringKit.indexOf(allLines[0], StringKit.whitespacePattern));
        headerLine = StringKit.split(allLines[1], "\t");
        contentLines = new String[allLines.length - 2][headerLine.length];
        String temp;
        int idx;
        for (int i = 0; i < contentLines.length; i++) {
            temp = allLines[i+2];
            idx = -1;
            for (int j = 0; j < headerLine.length - 1; j++) {
                contentLines[i][j] = StringKit.safeSubstring(temp, idx+1, idx = temp.indexOf('\t', idx+1));
            }
            contentLines[i][headerLine.length-1] = temp.substring(idx+1);
        }
    }
}
