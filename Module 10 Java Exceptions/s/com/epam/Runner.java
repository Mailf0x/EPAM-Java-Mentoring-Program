package com.epam;

public class Runner {

    public static int method() {

        try {
            return 4;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
