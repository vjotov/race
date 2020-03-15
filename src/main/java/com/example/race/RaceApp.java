package com.example.race;

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

//        racerInfoMap.entrySet().stream()
//                .forEach(<k,v> -> {});

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd_HH:mm:ss.SSS");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
//        TemporalAccessor ta1 = dtf.parse("12:02:50.917");
//        Instant t1 = Instant.from(ta1);
////        Instant t1 = Instant.from(dtf.parse("2018-05-24_12:02:50.917"));
////        Instant t2 = Instant.from(dtf.parse("2018-05-24_12:03:38.917"));
//        TemporalAccessor ta2 =  dtf.parse("12:03:38.917");
//        Instant t2 = Instant.from(ta2);
//        String myDateString = ;
        LocalTime t1 = LocalTime.parse("12:03:53.917", DateTimeFormatter.ofPattern(""));
        LocalTime t2 = LocalTime.parse("12:02:50.903", DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));

        Duration d = Duration.between(t1,t2);
    }
}
