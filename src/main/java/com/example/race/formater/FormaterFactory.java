package com.example.race.formater;

public class FormaterFactory {
        private final static String NORMAL = "Normal";

    public static Formater getFormater(String formatterName) {
        if (NORMAL.equals(formatterName)) {
            return new FormaterImpl();
        }
        return null;
    }

    private FormaterFactory() {
    }
}
