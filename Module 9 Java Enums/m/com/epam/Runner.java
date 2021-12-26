package com.epam;

import java.util.EnumSet;
import java.util.EnumMap;

public class Runner {

    public enum Char {
        A, B, C;
    }

    public static void main(String[] args) {
        EnumSet set = EnumSet.allOf(Char.class);
        EnumMap map = new EnumMap(Char.class);

        System.out.println(set);
        map.put(Char.A, 'a');
        map.put(Char.B, 'b');
        map.put(Char.C, 'c');
        System.out.println(map.entrySet());
    }
}
