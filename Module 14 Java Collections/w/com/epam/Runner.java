package com.epam;

import java.util.Set;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("string");
        set.add("another string");
        set.add("and another string");
        System.out.println(set);
    }
}
