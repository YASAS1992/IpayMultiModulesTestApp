package com.example.common;

public class Parent {
    private static String abc;

    public static String getAbc() {
        return abc;
    }

    public static void setAbc(String abc) {
        Parent.abc = abc;
    }
}
