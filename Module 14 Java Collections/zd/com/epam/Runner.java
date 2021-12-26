package com.epam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        Map<String, String> anotherMap = new LinkedHashMap<>(32);
        Map<String, String> m = new HashMap<>();
        Map<String, String> andAnotherMap = new LinkedHashMap<>(m);
    }
}
