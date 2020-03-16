package com.example.race.reader;

import com.example.race.domain.RacerInfo;

import java.util.Map;

public class ModelReaderFactory {
    static final private String ABBREVIATION = "Abbreviation";
    static final private String START_TIME = "Start Time";
    static final private String END_TIME = "End Time";

    static final private String ABBR_FILENAME = "abbreviations.txt";
    static final private String START_FILENAME = "start.log";
    static final private String END_FILENAME = "end.log";

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
}
