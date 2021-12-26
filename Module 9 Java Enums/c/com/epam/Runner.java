package com.epam;

public class Runner {

    public enum Char {
        A, B, C
    }

    public static void main(String[] args) {
        Char c = Char.valueOf("C");
        Char d = Char.valueOf("D");
    }
}
