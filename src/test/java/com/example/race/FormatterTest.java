package com.example.race;

import com.example.race.formater.Formater;
import com.example.race.formater.FormaterFactory;
import com.example.race.formater.FormaterImpl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FormatterTest {

    @Test
    public void AbbreviationReader() {
        Formater formater = FormaterFactory.getDefault();

        assertNotNull(formater);
        assertThat(formater, instanceOf(FormaterImpl.class));
    }

    @Test
    public void formatNullTest() {
        Formater formater = FormaterFactory.getDefault();
        assertThrows(IllegalArgumentException.class, () -> {
            formater.format(null);
        });
    }
}
