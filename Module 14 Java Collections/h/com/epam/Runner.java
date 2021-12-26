package com.epam;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> anotherList = new LinkedList<>(set);
    }
}
