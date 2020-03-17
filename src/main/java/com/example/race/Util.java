package com.example.race;

import com.example.race.domain.RacerInfo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Util {
    private Util() {
    }

    static List<RacerInfo> toStringRacerInfo(Map<String, RacerInfo> source) {
        if(source == null) {
            throw new IllegalArgumentException("source cannot be null");
        }

        Comparator<Map.Entry<String, RacerInfo>> comparator = Comparator.comparing(entry -> entry.getValue().getLapTime());

        return source
                .entrySet()
                .stream()
                .sorted(comparator)
                .map(entry -> (entry).getValue())
                .collect(Collectors.toList());
    }

    static void calculateLapTimes(Map<String, RacerInfo> racerInfoMap) {
        if(racerInfoMap == null) {
            throw new IllegalArgumentException("racerInfoMap cannot be null");
        }

        racerInfoMap
                .forEach((k, v) -> (v).calculateTimeLap()
                );
    }
}
