package com.epam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("string", "another string",
            "and another string");
        List<Integer> anotherList = Arrays.asList(64, 32, 16, 8);

        Collections.sort(list);
        System.out.println(list);

        anotherList.sort(new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });
        System.out.println(anotherList);
    }
}
