package com.example.race.reader;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class ModelReader {
    private String fileName;

    public ModelReader(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, Object> readFile() throws IOException{
        Map<String, Object> result = new HashMap<>();
        File file = new File(
                getClass().getClassLoader().getResource(fileName).getFile()
        );

        CSVReader csvReader = new CSVReader(new FileReader(file),'_');
        String [] line;
        while ((line = csvReader.readNext()) != null) {
            modelParse(result, line);
        }
        return result;
    }
    protected void modelParse(Map<String, Object> result, String[] args) {

    }
}
