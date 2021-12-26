package com.epam;

import java.util.Arrays;

public class Runner {

    public enum Char {
        A, B, C
    }

    public static void main(String[] args) {
        Char ch = Char.valueOf("A");

        System.out.println(ch.equals(Char.A));
        System.out.println(ch == Char.A);
    }
}
