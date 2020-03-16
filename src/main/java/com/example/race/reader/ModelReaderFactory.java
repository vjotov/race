package com.example.race.reader;

import com.example.race.domain.RacerInfo;

import java.util.Map;

public class ModelReaderFactory {
    private static final String ABBREVIATION = "Abbreviation";
    private static final String START_TIME = "Start Time";
    private static final String END_TIME = "End Time";

    private static final String ABBR_FILENAME = "abbreviations.txt";
    private static final String START_FILENAME = "start.log";
    private static final String END_FILENAME = "end.log";

    @SuppressWarnings("unchecked")
    public static ModelReader getReader(String readerName, Map<String, RacerInfo> result) {
        if (ABBREVIATION.equals(readerName)) {
            return new AbbreviationReader(ABBR_FILENAME, result);
        }
        if (START_TIME.equals(readerName)) {
            return new StartTimeReader(START_FILENAME, result);
        }
        if (END_TIME.equals(readerName)) {
            return new EndTimeReader(END_FILENAME, result);
        }

        return null;
    }

    private ModelReaderFactory() {}
}
