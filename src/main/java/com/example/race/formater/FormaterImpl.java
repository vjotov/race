package com.example.race.formater;

import com.example.race.domain.RacerInfo;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FormaterImpl implements Formater {
    private static final String LINE_PATTERN = "%2d. %-20s | %-25s | %-8s";
    private static final String TIME_PATTERN = "mm:ss,SSS";
    private static final String TOP_N_SEPARATOR = "%n----------------------------------------------------------------";
    private static final int TOP_N = 15;

    @Override
    public String format(List<RacerInfo> racerInfoList) {
        AtomicInteger index = new AtomicInteger();

        return racerInfoList.stream()
                .map(racer ->
                        String.format(LINE_PATTERN,
                                index.getAndIncrement() + 1,
                                racer.getName(),
                                racer.getTeam(),
                                DurationFormatUtils.formatDuration(racer.getLapTime().toMillis(), TIME_PATTERN)
                        )
                )
                .map(str -> index.get() == 15 ? (str + String.format(TOP_N_SEPARATOR)) : str)
                .collect(Collectors.joining("\n"));
    }
}
