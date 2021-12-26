package com.epam;

public class Processor {

    public void methodWithWidening() {
        byte a = (byte)2;
        short b = a;
    }

    public void methodWithNarrowing() {
        long a = 4;
        int b = (int)a;
    }
}
