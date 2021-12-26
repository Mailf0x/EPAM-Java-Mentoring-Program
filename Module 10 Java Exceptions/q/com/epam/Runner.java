package com.epam;

public class Runner {

    public static void main(String[] args) {

        try {
            throw new Throwable("Throwable", new NullPointerException());
        } catch (Throwable e) {
            System.out.println(e.getCause());
        }
    }
}
