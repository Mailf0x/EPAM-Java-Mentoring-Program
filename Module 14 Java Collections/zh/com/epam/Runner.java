package com.epam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("string", "another string",
            "and another string");
        List<String> list = new LinkedList<>();

        list.addAll(l);
        list.clear();
        System.out.println(list.isEmpty());
    }
}
