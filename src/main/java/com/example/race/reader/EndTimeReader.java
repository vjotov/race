package com.example.race.reader;

import com.example.race.domain.RacerInfo;

import java.time.LocalTime;
import java.util.Map;

public class EndTimeReader extends TimeReader {
    public EndTimeReader(String fileName, Map<String, RacerInfo> result) {
        super(fileName, result);
    }

    @Override
    protected void updateRacer(RacerInfo racer, LocalTime timeResult) {
        racer.setEndTime(timeResult);
    }
}
