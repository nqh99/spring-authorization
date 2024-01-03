package com.example.utils;

public class Utils {
    public static String trim(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return str.trim();
    }
}
