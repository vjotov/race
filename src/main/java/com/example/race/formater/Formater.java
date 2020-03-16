package com.example.race.formater;

import com.example.race.domain.RacerInfo;

import java.util.List;

public interface Formater {
    String format(List<RacerInfo> result);
}
