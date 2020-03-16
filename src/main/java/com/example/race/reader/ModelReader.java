package com.example.race.reader;

import com.example.race.domain.RacerInfo;
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public abstract class ModelReader {
    private String fileName;
    private Map<String, RacerInfo> result;

    public ModelReader(String fileName, Map<String, RacerInfo> result) {
        if (fileName == null) {
            throw new IllegalArgumentException("FileName can't be null");
        }
        if (result == null) {
            throw new IllegalArgumentException("Result can't be null");
        }
        this.fileName = fileName;
        this.result = result;
    }

    public Map<String, RacerInfo> readFile() throws IOException {
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

    protected void modelParse(Map<String, RacerInfo> result, String[] args) {

    }
}
