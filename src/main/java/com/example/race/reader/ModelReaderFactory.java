package com.example.race.reader;

import java.util.Map;

public class ModelReaderFactory {
    final static String ABBREVIATION = "Abbreviation";
    final static String START_TIME = "Start Time";
    final static String END_TIME = "End Time";

    final static String ABBR_FILENAME = "abbreviations.txt";
    final static String START_FILENAME = "start.log";
    final static String END_FILENAME = "end.log";

    @SuppressWarnings("unchecked")
    public static ModelReader getReader(String readerName, Map<String,Object> result) {
        if(ABBREVIATION.equals(readerName)) {
            return new AbbreviationReader(ABBR_FILENAME,result);
        }
        if(START_TIME.equals(readerName)) {
            return new StartTimeReader(START_FILENAME, result);
        }
        if(END_TIME.equals(readerName)) {
            return new EndTimeReader(END_FILENAME, result);
        }

        return null;
    }
}
