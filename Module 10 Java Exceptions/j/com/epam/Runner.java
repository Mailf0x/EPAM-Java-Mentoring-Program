package com.epam;

public class Runner {

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (ArithmeticException | NullPointerException e) {
            System.err.println("Catched Exception");
        }
    }
}
