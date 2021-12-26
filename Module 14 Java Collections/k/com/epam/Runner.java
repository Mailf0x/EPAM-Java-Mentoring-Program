package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("string");
        list.add("another string");
        list.add("and another string");
        list.add("and one another string");

        for (String s : list) {
            list.remove(s);
        }
    }
}
