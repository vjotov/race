package com.example.race;

import com.example.race.domain.RacerInfo;
import com.example.race.reader.ModelReader;
import com.example.race.reader.ModelReaderFactory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RaceApp {
    public static void main(String[] args) {
        Map<String, Object> racerInfoMap = new HashMap<>();

        ModelReader abr = ModelReaderFactory.getReader("Abbreviation", racerInfoMap);
        ModelReader startTimeReader = ModelReaderFactory.getReader("Start Time", racerInfoMap);
        ModelReader endTimeReader = ModelReaderFactory.getReader("End Time", racerInfoMap);
        try {
            abr.readFile();
            startTimeReader.readFile();
            endTimeReader.readFile();
        } catch (Exception ex) {
        }

        racerInfoMap
                .forEach((k, v) -> (
                        (RacerInfo) v).calculateTimeLap()
                );
        Map<String, RacerInfo> racerResult = toStringRacerInfo(racerInfoMap);
        Comparator<Map.Entry<String, RacerInfo>> comparator = Comparator.comparing(entry -> (entry.getValue()).getLapTime());


        List<Object> finalResult = racerResult
                .entrySet()
                .stream()
                .sorted(comparator)
                .limit(15)
                .collect(Collectors.toList());
        String a = "2";
//        finalResult.forEach(System.out.);

    }

    static Map<String, RacerInfo> toStringRacerInfo(Map<String, ? extends Object> map) {
        return map
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> (RacerInfo) e.getValue()
                ));
    }
}
