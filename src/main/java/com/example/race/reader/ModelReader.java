package com.example.race.reader;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public abstract class ModelReader {
    private String fileName;
    private Map<String, Object> result;

    public ModelReader(String fileName, Map<String, Object> result) {
        if (fileName == null) {
            throw new IllegalArgumentException("FileName can't be null");
        }
        if (result == null) {
            throw new IllegalArgumentException("Result can't be null");
        }
        this.fileName = fileName;
        this.result = result;
    }

    public Map<String, Object> readFile() throws IOException {
        File file = new File(
                getClass().getClassLoader().getResource(fileName).getFile()
        );

        CSVReader csvReader = new CSVReader(new FileReader(file), '_');
        String[] line;
        while ((line = csvReader.readNext()) != null) {
            modelParse(result, line);
        }
        return result;
    }

    protected void modelParse(Map<String, Object> result, String[] args) {

    }
}
