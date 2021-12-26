package com.epam;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Runner {

    public Map<String, String> method() {
        return Collections.emptyMap();
    }

    public Map<String, String> anotherMethod() {
        String s = new String();

        return Collections.singletonMap(s, s);
    }

    public Map<String, String> andAnotherMethod() {
        Map<String, String> m = new HashMap<>();

        return Collections.unmodifiableMap(m);
    }
}
