package com.epam;

public class Processor {

    public void methodWithint() {
        int a = 2;
        Integer b = new Integer(a);
        int c = b.intValue();
        Integer d = a;
        int e = d;
    }
}
