package com.shvnix.securepass.core;

import java.util.Random;

public class PasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    private static final Random random = new Random();

    public static String generate(int length, boolean upper, boolean digits, boolean symbols) {

        StringBuilder chars = new StringBuilder(LOWER);

        if (upper) chars.append(UPPER);
        if (digits) chars.append(DIGITS);
        if (symbols) chars.append(SYMBOLS);

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return password.toString();
    }
}
