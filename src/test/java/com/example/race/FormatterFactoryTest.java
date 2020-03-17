package com.example.race;

import com.example.race.domain.RacerInfo;
import com.example.race.formater.Formater;
import com.example.race.formater.FormaterFactory;
import com.example.race.formater.FormaterImpl;
import com.example.race.reader.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FormatterFactoryTest {
    @Test
    public void WrongFactoryName() {
        Formater formater = FormaterFactory.getFormater("worng reader");
        assertNull(formater);
    }

    @Test
    public void AbbreviationReader() {
        Formater formater = FormaterFactory.getFormater("Normal");

        assertNotNull(formater);
        assertThat(formater, instanceOf(FormaterImpl.class));
    }
}
