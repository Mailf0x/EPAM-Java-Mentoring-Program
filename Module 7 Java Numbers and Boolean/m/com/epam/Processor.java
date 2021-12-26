package com.epam;

public class Processor {

    public void methodWithFloatType() {
        float a = Float.parseFloat("2.8");
        String b = String.valueOf(a);
    }

    public void methodWithFloat() {
        Float a = Float.valueOf("4.16");
        String b = a.toString();
    }
}
