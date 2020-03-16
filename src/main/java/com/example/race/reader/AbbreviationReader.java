package com.example.race.reader;

import com.example.race.domain.RacerInfo;

import java.util.Map;

public class AbbreviationReader extends ModelReader {
    public AbbreviationReader(String fileName, Map<String,RacerInfo> result) {
        super(fileName, result);
    }

    @Override
    protected void modelParse(Map<String, RacerInfo> result, String[] args) {
        result.put(args[0],new RacerInfo(args[0], args[1], args[2]));
    }

}
