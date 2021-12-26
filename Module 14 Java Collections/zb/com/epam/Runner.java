package com.epam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> anotherMap = new HashMap<>(16);
        Map<String, String> m = new LinkedHashMap<>();
        Map<String, String> andAnotherMap = new HashMap<>(m);
    }
}
