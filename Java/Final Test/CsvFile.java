package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvFile {
    private List<String[]> lines = new ArrayList<>();
    private String[] names;
    private String separator;

    private CsvFile() {
    }

    CsvFile(String fileName, String separator) throws IOException {
        this.separator = separator;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        line = reader.readLine();
        names = line.split(separator);
        while ((line = reader.readLine()) != null) {
            lines.add(line.split(separator));
        }
    }

    public String[] getNames() {
        return names;
    }

    public CsvFile search(String str, int index) {
        if (index >= names.length || index < 0) {
            throw new IllegalArgumentException("wrong csv index: " + index);
        }
        CsvFile csvFile = new CsvFile();
        csvFile.separator = this.separator;
        csvFile.names = names;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i)[index].toLowerCase().contains(str.toLowerCase())) {
                csvFile.lines.add(lines.get(i));
            }
        }
        return csvFile;
    }

    public void saveCsvFile(CsvFile csvFile, String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        for (int i = 0; i < csvFile.names.length; i++) {
            fileWriter.write(csvFile.names[i]);
            if (i != (csvFile.names.length - 1)) {
                fileWriter.write(csvFile.separator);
            }
        }
        fileWriter.write(System.getProperty("line.separator"));
        for (String[] line : csvFile.lines) {
            for (int i = 0; i < line.length; i++) {
                fileWriter.write(line[i]);
                if (i != (line.length - 1)) {
                    fileWriter.write(csvFile.separator);
                }
            }
            fileWriter.write(System.getProperty("line.separator"));
        }
    }

    @Override
    public String toString() {
        return "CsvFile{" +
                "lines=" + lines +
                ", \nnames=" + Arrays.toString(names) +
                ", \nseparator='" + separator + '\'' +
                '}';
    }
}
