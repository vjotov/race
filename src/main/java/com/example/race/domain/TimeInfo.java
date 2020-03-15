package com.example.race.domain;

import java.time.Instant;
import java.time.LocalTime;

public class TimeInfo {

    private String racerCode;
    private LocalTime time;

    public TimeInfo(String racerCode, LocalTime time) {
        this.racerCode = racerCode;
        this.time = time;
    }

    public String getRacerCode() {
        return racerCode;
    }

    public void setRacerCode(String racerCode) {
        this.racerCode = racerCode;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime instant) {
        this.time = instant;
    }
}
