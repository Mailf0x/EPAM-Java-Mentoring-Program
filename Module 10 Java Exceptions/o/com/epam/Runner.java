package com.epam;

public class Runner {

    public static void main(String[] args) {

        try {
            int a = 2 / 0;

        } catch (ArithmeticException e) {
            Throwable t = (Throwable)e;

            System.out.println(t.getCause());
            System.out.println(t.getMessage());
        }
    }
}
