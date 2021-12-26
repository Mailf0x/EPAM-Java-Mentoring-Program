package com.epam;

public class Runner {

    public static void method(boolean a) {
        a = true;
    }

    public static void main(String[] args) {
        boolean a = false;

        method(a);
        System.out.println(a);
    }
}
