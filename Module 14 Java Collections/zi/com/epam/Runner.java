package com.epam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4, 8, 16, 32);
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addAll(l);
        deque.clear();
        System.out.println(deque.isEmpty());
    }
}
