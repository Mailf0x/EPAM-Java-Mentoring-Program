package com.epam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(8, 16, 32, 64);
        Set<Integer> set = new HashSet<>();

        set.addAll(l);
        set.clear();
        System.out.println(set.isEmpty());
    }
}
