package com.epam;

public class Runner {

    public static void main(String[] args) {
        float nan = Float.NaN;

        System.out.println("Nan + 2: " + (nan + 2));
        System.out.println("Nan - 2: " + (nan - 2));
        System.out.println("Nan * 2: " + (nan * 2));
        System.out.println("Nan / 2: " + (nan / 2));
        System.out.println("Nan + Nan: " + (nan + nan));
        System.out.println("Nan - Nan: " + (nan - nan));
        System.out.println("Nan * Nan: " + (nan * nan));
        System.out.println("Nan / Nan: " + (nan / nan));
    }
}
