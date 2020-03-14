package com.example.race.reader;

public class ModelReaderFactory {
    final static String ABBREVIATION = "Abbreviation";
    final static String START_TIME = "Start Time";
    final static String END_TIME = "End Time";

    final static String ABBR_FILENAME = "abbreviations.txt";
    final static String START_FILENAME = "start.log";
    final static String END_FILENAME = "end.log";

    public static ModelReader getReader(String readerName) {
        if(ABBREVIATION.equals(readerName)) {
            return new AbbreviationReader(ABBR_FILENAME);
        }
        if(START_TIME.equals(readerName)) {
            return new TimeReader(START_FILENAME);
        }
        if(END_TIME.equals(readerName)) {
            return new TimeReader(END_FILENAME);
        }

        return null;
    }
}
