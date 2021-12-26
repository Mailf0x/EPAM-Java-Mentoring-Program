package com.epam;

public class Runner {

    public static void method(Integer a) {
        System.out.println("It's integer");
    }

    public static void method(String a) {
        System.out.println("It's string");
    }

    public static void main(String[] args) {
        Integer a = 0;

        method(a);
        method("string");
        // method(null); reference to method is ambiguous
    }
}
