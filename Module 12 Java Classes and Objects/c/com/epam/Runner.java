package com.epam;

public class Runner {

    public static void method(Object a) {
        System.out.println("It's object");
    }

    public static void method(String a) {
        System.out.println("It's string");
    }

    public static void main(String[] args) {
        Object a = new Object();

        method(a);
        method("string");
        method(null);
    }
}
