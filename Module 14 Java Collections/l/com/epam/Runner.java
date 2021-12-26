package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 8, 16);
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();

            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}
