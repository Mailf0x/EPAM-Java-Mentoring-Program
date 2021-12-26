package com.epam;

public class Runner {

    public static int method() {

        try {
            throw new NullPointerException();
        } finally {
            return 8;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
