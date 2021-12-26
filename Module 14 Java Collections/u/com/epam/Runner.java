package com.epam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        List<String> list = Arrays.asList("string", "another string",
            "one another string", "and one another string");
        Set<String> anotherSet = new TreeSet<>(list);

        Set<String> andAnotherSet = new TreeSet<>(new
            Comparator<String>(){

            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
    }
}
