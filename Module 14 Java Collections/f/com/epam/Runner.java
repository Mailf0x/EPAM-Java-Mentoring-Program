package com.epam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> anotherList = new ArrayList<>(set);
        List<Integer> andAnotherList = new ArrayList<>(8);
    }
}
