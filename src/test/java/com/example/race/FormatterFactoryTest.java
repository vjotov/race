package com.example.race;

import com.example.race.formater.Formater;
import com.example.race.formater.FormaterFactory;
import com.example.race.formater.FormaterImpl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FormatterFactoryTest {


    @Test
    public void AbbreviationReader() {
        Formater formater = FormaterFactory.getDefault();

        assertNotNull(formater);
        assertThat(formater, instanceOf(FormaterImpl.class));
    }
}
