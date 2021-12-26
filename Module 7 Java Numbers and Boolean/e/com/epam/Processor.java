package com.epam;

public class Processor {

    public void methodWithInt() {
        int a = Integer.parseInt("16");
        String b = Integer.toString(a);
        String c = Integer.toHexString(a);
    }

    public void methodWithInteger() {
        Integer a = Integer.valueOf("32");
        String b = a.toString();
        String c = Integer.toHexString(a.intValue());
    }
}
