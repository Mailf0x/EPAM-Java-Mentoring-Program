package com.epam;

public class Runner {

    public static void main(String[] args) {
        String[] a = "string".split("i");
        String b = " string ".trim();
        String c = "String".toLowerCase();
        String d = "String".toUpperCase();
        String e = "string".replace('s', 'b');
        String f = "stringstring".replaceAll("str", "int");
        String g = "stringstring".replaceFirst("str", "int");
    }
}
