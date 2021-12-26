package com.epam;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(2, 8);
        map.put(4, 16);
        System.out.println(map.size());
    }
}
