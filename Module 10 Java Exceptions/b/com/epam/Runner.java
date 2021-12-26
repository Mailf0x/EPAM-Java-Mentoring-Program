package com.epam;

import java.util.List;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        List<RuntimeException> list = new ArrayList<>();

        list.add(new ArithmeticException());
        list.add(new ArrayIndexOutOfBoundsException());
        list.add(new ArrayStoreException());
        list.add(new ClassCastException());
        list.add(new IllegalArgumentException());
        for (RuntimeException re : list) {
            try {
                throw re;
            } catch (RuntimeException e) {
                System.out.println("It's runtime exception");
            }
        }
    }
}
