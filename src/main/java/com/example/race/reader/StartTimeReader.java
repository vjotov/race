package com.example.race.reader;

import com.example.race.domain.RacerInfo;

import java.time.LocalTime;
import java.util.Map;

public class StartTimeReader extends TimeReader {
    public StartTimeReader(String fileName, Map<String,Object> result) {
        super(fileName,result);
    }

    @Override
    protected void updateRacer(RacerInfo racer, LocalTime timeResult) {
        racer.setStartTime(timeResult);
    }
}
