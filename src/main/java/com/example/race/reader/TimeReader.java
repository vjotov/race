package com.example.race.reader;

import java.util.Map;

public class TimeReader extends ModelReader {

    public TimeReader(String fileName) {
        super(fileName);
    }

    @Override
    protected void modelParse(Map<String, Object> result, String[] args) {
        result.put(args[0].substring(0,3), args[1]);
    }
}
