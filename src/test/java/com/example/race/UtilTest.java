package com.example.race;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilTest {
    @Test
    public void calculateNullArgTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.calculateLapTimes(null);
        });
    }

    @Test
    public void toStringNullArgTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.toStringRacerInfo(null);
        });
    }
}
