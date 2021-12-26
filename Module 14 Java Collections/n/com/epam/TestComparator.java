package com.epam;

import java.util.Comparator;

public class TestComparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }
}
