package com.example.client_lab6.validation;

public class Validation {
    public static boolean isNumber(String number) {
        return !number.equals("") && number != null && number.matches("\\d+?");
    }

    public static int getNumber(String number) {
        if (Validation.isNumber(number))
            return Integer.parseInt(number);
        return 0;
    }

    public static boolean isString(String str) {
        return !str.equals("") && str != null;
    }
}
