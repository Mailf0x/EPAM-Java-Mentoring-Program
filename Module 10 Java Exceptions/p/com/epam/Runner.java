package com.epam;

public class Runner {

    public static void main(String[] args) {
        Object a = null;

        try {
            System.out.println(a.hashCode());
        } catch (NullPointerException e) {
            StackTraceElement[] b = e.getStackTrace();

            e.printStackTrace();
        }
    }
}
