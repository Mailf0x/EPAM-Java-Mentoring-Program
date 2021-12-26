package com.epam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Runner {

    public Set<String> method() {
        return Collections.emptySet();
    }

    public Set<String> anotherMethod() {
        String s = new String();

        return Collections.singleton(s);
    }

    public Set<String> andAnotherMethod() {
        Set<String> s = new HashSet<>();

        return Collections.unmodifiableSet(s);
    }
}
