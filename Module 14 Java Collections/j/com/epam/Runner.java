package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public List<Integer> method() {
        return Collections.emptyList();
    }

    public List<Integer> anotherMethod() {
        Integer i = new Integer(2);

        return Collections.singletonList(i);
    }

    public List<Integer> andAnotherMethod() {
        List<Integer> l = new ArrayList<>();

        return Collections.unmodifiableList(l);
    }
}
