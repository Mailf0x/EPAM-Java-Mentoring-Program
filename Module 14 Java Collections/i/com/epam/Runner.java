package com.epam;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Runner {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        System.out.println(linkedList instanceof Queue);
        System.out.println(linkedList instanceof Deque);
    }
}
