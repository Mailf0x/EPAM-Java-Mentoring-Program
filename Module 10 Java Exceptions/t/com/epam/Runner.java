package com.epam;

public class Runner {

    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        } finally {
            throw new NullPointerException();
        }
    }
}
