package com.example.race;

import com.example.race.reader.AbbreviationReader;

import java.util.Map;

public class RaceApp {
    public static void main(String[] args) {
        AbbreviationReader abr = new AbbreviationReader();
        try {
            Map<String, Object> racerInfoMap = abr.readFile();
        }
        catch (Exception ex){}

    }
}
