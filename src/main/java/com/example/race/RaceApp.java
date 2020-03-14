package com.example.race;

import com.example.race.reader.AbbreviationReader;
import com.example.race.reader.ModelReader;
import com.example.race.reader.ModelReaderFactory;

import java.util.Map;

public class RaceApp {
    public static void main(String[] args) {
        ModelReader abr = ModelReaderFactory.getReader("Abbreviation");
        try {
            Map<String, Object> racerInfoMap = abr.readFile();
        }
        catch (Exception ex){}

    }
}
