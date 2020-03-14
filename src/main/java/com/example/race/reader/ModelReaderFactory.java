package com.example.race.reader;

public class ModelReaderFactory {
    final String ABBREVIATION = "Abbreviation";
    final String START_TIME = "Start Time";
    final String END_TIME = "End Time";

    final String ABBR_FILENAME = "abbreviations.txt";
    final String START_FILENAME = "start.log";
    final String END_FILENAME = "end.log";

    ModelReader getReader(String readerName) {
        if(ABBREVIATION.equals(readerName)) {
            return new AbbreviationReader(ABBR_FILENAME);
        }
        if(START_TIME.equals(readerName)) {
            return new AbbreviationReader(START_FILENAME);
        }
        if(END_TIME.equals(readerName)) {
            return new AbbreviationReader(END_FILENAME);
        }

        return null;
    }
}
