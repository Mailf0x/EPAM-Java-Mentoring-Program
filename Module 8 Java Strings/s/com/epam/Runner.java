package com.epam;

public class Runner {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("string");
        StringBuffer b = new StringBuffer("string");

        a.append("builder");
        System.out.println(a.toString());
        b.append("buffer");
        System.out.println(b.toString());
    }
}
