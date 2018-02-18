package com.github.tommyettinger.tablab;

import regexodus.Pattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

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
        read(filename, Pattern.compile("\\V+").matcher(text).foundStrings());
    }
    public void read(String filename, List<String> allLines)
    {
        //allLines = text.split("\r\n|[\n-\r\u0085\u2028\u2029]");

        String line;
        if((line = allLines.get(allLines.size() - 1)) == null || line.isEmpty())
            allLines.remove(allLines.size() - 1);
        int idx;
        keyColumn = null;
//        line = allLines.get(0);
//        int idx = line.lastIndexOf('.');
//        packageName = StringKit.safeSubstring(line, 0, idx);
//        name = StringKit.safeSubstring(line, idx+1, idx = StringKit.indexOf(line, StringKit.whitespacePattern));
//        if(idx < 0)
//            keyColumn = "void";
//        else
//        {
//            keyColumn = StringKit.safeSubstring(line,
//                    idx = StringKit.indexOf(line, StringKit.nonSpacePattern, idx),
//                    StringKit.indexOf(line, StringKit.whitespacePattern, idx));
//            if("void".equalsIgnoreCase(keyColumn))
//                keyColumn = "";
//        }
        if(filename == null)
            name = "Untitled";
        else if((idx = filename.indexOf('.')) >= 0)
            name = StringKit.safeSubstring(filename, 0, idx);
        else
            name = filename;
        headerLine = StringKit.split(allLines.get(0), "\t");
        //if("void".equals(keyColumn))
        //    keyColumn = headerLine[0];
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
//                    if(temp.charAt(idx - 1) == '^')
//                        keyColumn = (contentLines[i][j] = StringKit.safeSubstring(contentLines[i][j], 0, contentLines[i][j].length() - 1));
//                    else if(keyColumn == null)
//                        keyColumn = contentLines[i][j];
                }
            }
            if("".equals(headerLine[headerLine.length - 1]))
                contentLines[i][headerLine.length - 1] = "";
            else
            {
                contentLines[i][headerLine.length-1] = temp.substring(idx+1);
//                if(temp.charAt(idx - 1) == '^')
//                    keyColumn = (contentLines[i][headerLine.length-1] = StringKit.safeSubstring(contentLines[i][headerLine.length-1], 0, contentLines[i][headerLine.length-1].length() - 1));
//                else if(keyColumn == null)
//                    keyColumn = contentLines[i][headerLine.length-1];
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSVReader tsvReader = (TSVReader) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(headerLine, tsvReader.headerLine)) return false;
        if (!Arrays.deepEquals(contentLines, tsvReader.contentLines)) return false;
        if (name != null ? !name.equals(tsvReader.name) : tsvReader.name != null) return false;
        return keyColumn != null ? keyColumn.equals(tsvReader.keyColumn) : tsvReader.keyColumn == null;
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
