package com.example.race;

import com.example.race.domain.RacerInfo;
import com.example.race.reader.AbbreviationReader;
import com.example.race.reader.ModelReader;
import com.example.race.reader.ModelReaderFactory;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class RaceApp {
    public static void main(String[] args) {
        Map<String, Object> racerInfoMap = new HashMap<>();;
        ModelReader abr = ModelReaderFactory.getReader("Abbreviation", racerInfoMap);
        ModelReader startTimeReader = ModelReaderFactory.getReader("Start Time", racerInfoMap);
        ModelReader endTimeReader = ModelReaderFactory.getReader("End Time", racerInfoMap);
        try {
            abr.readFile();
            startTimeReader.readFile();
            endTimeReader.readFile();
        }
        catch (Exception ex){}

        racerInfoMap
                .forEach((k,v) -> ((RacerInfo)v).calculateTimeLap());

        LocalTime t1 = LocalTime.parse("12:03:53.917", DateTimeFormatter.ofPattern(""));
        LocalTime t2 = LocalTime.parse("12:02:50.903", DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));

        Duration d = Duration.between(t1,t2);
    }
}
