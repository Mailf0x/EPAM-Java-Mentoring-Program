package com.epam;

public class Runner {

    public enum Char {
        A, B, C;
    }

    public static void main(String[] args) {
        Char ch = Char.A;

        System.out.println(ch.name());
        System.out.println(ch.toString());
        System.out.println(ch.ordinal());
    }
}
