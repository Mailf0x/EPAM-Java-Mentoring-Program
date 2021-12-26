package com.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("string", "another string");
        List<String> list = new ArrayList<>();

        list.addAll(l);
        list.clear();
        System.out.println(list.isEmpty());
    }
}
