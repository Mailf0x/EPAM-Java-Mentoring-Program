package com.epam;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Runner {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        Map<Integer, Integer> m = new HashMap<>();
        Map<Integer, Integer> anotherMap = new TreeMap<>(m);

        Map<Integer, Integer> andAnotherMap = new TreeMap<>(new
            Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });
    }
}
