package com.epam;

import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 19; i >= 0; i--) {
            set.add(i);
        }
        System.out.println(set);
    }
}
