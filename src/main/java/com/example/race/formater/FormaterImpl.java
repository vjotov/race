package com.example.race.formater;

import com.example.race.domain.RacerInfo;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FormaterImpl implements Formater {
    private static final String LINE_PATTERN = "%2d. %-20s | %-25s | %-8s";
    private static final String TIME_PATTERN = "mm:ss,SSS";
    private static final String TOP_N_SEPARATOR = "----------------------------------------------------------------";
    private static final int TOP_N = 15;

    @Override
    public String format(List<RacerInfo> racerInfoList) {
        AtomicInteger index = new AtomicInteger();
        List<String> resultList = new ArrayList<>();
        racerInfoList.stream()
                .limit(TOP_N)
                .forEach(racer -> {
                    resultList.add(String.format(LINE_PATTERN,
                            index.getAndIncrement() + 1,
                            racer.getName(),
                            racer.getTeam(),
                            DurationFormatUtils.formatDuration(racer.getLapTime().toMillis(), TIME_PATTERN)
                    ));
                });
        resultList.add(TOP_N_SEPARATOR);
        racerInfoList.stream()
                .skip(TOP_N)
                .forEach(racer -> {
                    resultList.add(String.format(LINE_PATTERN,
                            index.getAndIncrement() + 1,
                            racer.getName(),
                            racer.getTeam(),
                            DurationFormatUtils.formatDuration(racer.getLapTime().toMillis(), TIME_PATTERN)
                    ));
                });
        return String.join("\n", resultList);
    }
}
