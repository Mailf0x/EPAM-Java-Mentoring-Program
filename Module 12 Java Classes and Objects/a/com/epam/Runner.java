package com.epam;

public class Runner {

    public static void method(boolean a) {
        System.out.println("It's boolean");
    }

    public static void method(String a) {
        System.out.println("It's string");
    }

    public static void main(String[] args) {
        method(true);
        method("string");
        method(null);
    }
}
