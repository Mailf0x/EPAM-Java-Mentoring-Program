package com.epam;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        Set<String> anotherSet = new LinkedHashSet<>(16);
        List<String> list = Arrays.asList("string", "another string",
            "and another string", "and one another string");
        Set<String> andAnotherSet = new LinkedHashSet<>(list);
    }
}
