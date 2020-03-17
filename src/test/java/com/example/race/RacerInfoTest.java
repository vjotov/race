package com.example.race;

import com.example.race.domain.RacerInfo;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RacerInfoTest {
    static final String DATETIME_PATTERN = "HH:mm:ss.SSS";

    @Test
    public void LapTimeTest() {
        RacerInfo racer = new RacerInfo("AAA", "John Smith", "ABC TEAM");
        racer.setStartTime(LocalTime.parse("12:02:00.000", DateTimeFormatter.ofPattern(DATETIME_PATTERN)));
        racer.setEndTime(LocalTime.parse("12:02:01.200", DateTimeFormatter.ofPattern(DATETIME_PATTERN)));

        racer.calculateTimeLap();
        assertEquals((long) 1200,racer.getLapTime().toMillis());
    }
}
