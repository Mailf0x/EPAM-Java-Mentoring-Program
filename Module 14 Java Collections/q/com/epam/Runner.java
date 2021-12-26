package com.epam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> anotherSet = new HashSet<>(8);
        List<Integer> list = Arrays.asList(4, 8, 16, 32);
        Set<Integer> andAnotherSet = new HashSet<>(list);
    }
}
