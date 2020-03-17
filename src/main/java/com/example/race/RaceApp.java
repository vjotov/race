package com.example.race;

import com.example.race.domain.RacerInfo;
import com.example.race.formater.Formater;
import com.example.race.formater.FormaterFactory;
import com.example.race.reader.ModelReader;
import com.example.race.reader.ModelReaderFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceApp {
    public static void main(String[] args) {
        Map<String, RacerInfo> racerInfoMap = new HashMap<>();

        ModelReader abr = ModelReaderFactory.getReader("Abbreviation", racerInfoMap);
        ModelReader startTimeReader = ModelReaderFactory.getReader("Start Time", racerInfoMap);
        ModelReader endTimeReader = ModelReaderFactory.getReader("End Time", racerInfoMap);
        try {
            abr.readFile();
            startTimeReader.readFile();
            endTimeReader.readFile();
        } catch (Exception ex) {
            System.err.println("ERROR during input files reading");
            ex.printStackTrace();
            return;
        }

        Util.calculateLapTimes(racerInfoMap);
        List<RacerInfo> finalResult = Util.toStringRacerInfo(racerInfoMap);

        Formater formater = FormaterFactory.getDefault();
        String lines = formater.format(finalResult);
        System.out.println(lines);


    }

}
