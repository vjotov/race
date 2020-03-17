package com.example.race.formater;

public class FormaterFactory {

    public static Formater getDefault() {
            return new FormaterImpl();
    }

    private FormaterFactory() {
    }
}
