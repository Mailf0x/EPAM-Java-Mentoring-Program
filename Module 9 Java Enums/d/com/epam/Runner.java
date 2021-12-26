package com.epam;

import java.util.Arrays;

public class Runner {

    public enum Char {
        A, B, C;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Char.values()));
    }
}
