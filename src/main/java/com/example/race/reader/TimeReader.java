package com.example.race.reader;

import com.example.race.domain.RacerInfo;

import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public abstract class TimeReader extends ModelReader {
    static final String DATETIME_PATTERN = "HH:mm:ss.SSS";

    public TimeReader(String fileName, Map<String, RacerInfo> result) {
        super(fileName, result);
    }


    @Override
    protected void modelParse(Map<String, RacerInfo> result, String[] args) {
        String key = args[0].substring(0, 3);
        RacerInfo racer = (RacerInfo) result.get(key);
        LocalTime timeResult = LocalTime.parse(args[1], DateTimeFormatter.ofPattern(DATETIME_PATTERN));
        updateRacer(racer, timeResult);
    }

    protected void updateRacer(RacerInfo racer, LocalTime timeResult) {
    }
}
