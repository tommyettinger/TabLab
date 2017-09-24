package com.github.tommyettinger.tablab;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class Reader {
    public String[] headerLine;
    public String[] allLines;
    public String[][] contentLines;
    public Reader()
    {
    }
    public void read(String text)
    {
        allLines = text.split("\\R");
        headerLine = StringKit.split(allLines[0], "\t");
        contentLines = new String[allLines.length - 1][headerLine.length];
        String temp;
        int idx;
        for (int i = 0; i < contentLines.length; i++) {
            temp = allLines[i+1];
            idx = -1;
            for (int j = 0; j < headerLine.length - 1; j++) {
                contentLines[i][j] = StringKit.safeSubstring(temp, idx+1, idx = temp.indexOf('\t', idx+1));
            }
            contentLines[i][headerLine.length-1] = temp.substring(idx+1);
        }
    }
}
