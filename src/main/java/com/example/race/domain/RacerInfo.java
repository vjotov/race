package com.example.race.domain;

import java.time.Duration;
import java.time.LocalTime;

public class RacerInfo {
    private String abbreviation;
    private String name;
    private String team;
    private LocalTime startTime;
    private LocalTime endTime;
    private Duration lapTime;


    public RacerInfo(String abbreviation, String name, String team) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.team = team;
    }

    public void calculateTimeLap(){
        lapTime = Duration.between(startTime, endTime);
    };

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
