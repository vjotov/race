package com.example.race;

import com.example.race.domain.RacerInfo;
import com.example.race.reader.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ModelFactoryTest {
    @Test
    public void WrongFactoryName() {
        ModelReader reader = ModelReaderFactory.getReader("worng reader", null);
        assertNull(reader);
    }

    @Test
    public void AbbreviationReader() {
        Map<String, RacerInfo> result = new HashMap<>();
        ModelReader reader = ModelReaderFactory.getReader("Abbreviation", result);

        assertNotNull(reader);
        assertThat(reader, instanceOf(AbbreviationReader.class));
    }
    @Test
    public void StartTimeReader() {
        Map<String, RacerInfo> result = new HashMap<>();
        ModelReader reader = ModelReaderFactory.getReader("Start Time", result);

        assertNotNull(reader);
        assertThat(reader, instanceOf(StartTimeReader.class));
    }
    @Test
    public void EndTimeReader() {
        Map<String, RacerInfo> result = new HashMap<>();
        ModelReader reader = ModelReaderFactory.getReader("End Time", result);

        assertNotNull(reader);
        assertThat(reader, instanceOf(EndTimeReader.class));
    }
}
