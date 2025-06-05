package com.github.tommyettinger.tablab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Tommy Ettinger on 9/23/2017.
 */
public class TSVReader {
    public String[] headerLine;
    public String[][] contentLines;
    public String name;
    public String keyColumn;
    public TSVReader()
    {
    }
    public void read(String filename, String text)
    {
        read(filename, Arrays.asList(text.split("\\v+")));
   }
    public void read(String filename, List<String> allLines)
    {
        //allLines = text.split("\r\n|[\n-\r\u0085\u2028\u2029]");

        String line;
        if((line = allLines.get(allLines.size() - 1)) == null || line.isEmpty())
            allLines.remove(allLines.size() - 1);
        int idx;
        keyColumn = null;
        if(filename == null)
            name = "Untitled";
        else if((idx = filename.indexOf('.')) >= 0)
            name = StringKit.safeSubstring(filename, 0, idx);
        else
            name = filename;
        headerLine = StringKit.split(allLines.get(0), "\t");
        contentLines = new String[allLines.size() - 1][headerLine.length];
        String temp;
        for (int i = 0; i < contentLines.length; i++) {
            temp = allLines.get(i+1);
            idx = -1;
            for (int j = 0; j < headerLine.length - 1; j++) {
                if("".equals(headerLine[j]))
                {
                    contentLines[i][j] = "";
                    idx = temp.indexOf('\t', idx+1);
                }
                else
                {
                    contentLines[i][j] = StringKit.safeSubstring(temp, idx+1, idx = temp.indexOf('\t', idx+1));
                }
            }
            if("".equals(headerLine[headerLine.length - 1]))
                contentLines[i][headerLine.length - 1] = "";
            else
            {
                contentLines[i][headerLine.length-1] = temp.substring(idx+1);
            }
        }
    }

    public void readFile(String filename)
    {
        try {
            Path path = Paths.get(filename);
            read(path.getFileName().toString(), Files.readAllLines(path));
        } catch (IOException e) {
            System.err.println("Could not read file (check that path is correct): " + filename);
        }
    }
    private static boolean stringArrayEquals(String[] left, String[] right) {
        if (left == right) return true;
        if (left == null || right == null) return false;
        final int len = left.length;
        if(len != right.length) return false;
        for (int i = 0; i < len; i++) { if(!java.util.Objects.equals(left[i], right[i])) return false; }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSVReader tsvReader = (TSVReader) o;

        if (!stringArrayEquals(headerLine, tsvReader.headerLine)) return false;
        if (!Arrays.deepEquals(contentLines, tsvReader.contentLines)) return false;
        if (!Objects.equals(name, tsvReader.name)) return false;
        return Objects.equals(keyColumn, tsvReader.keyColumn);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(headerLine);
        result = 31 * result + Arrays.deepHashCode(contentLines);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (keyColumn != null ? keyColumn.hashCode() : 0);
        return result;
    }
}
