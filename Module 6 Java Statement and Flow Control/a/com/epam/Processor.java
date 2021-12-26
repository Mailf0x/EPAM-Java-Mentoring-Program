package com.epam;

public class Processor {

    public void expression(int a) {
        a = 2;
    }

    public void statement(int a) {
        int b = 2 * a;
    }

    public void block(int a) {
        boolean equalsTwo;

        if (a == 2) {
            equalsTwo = true;

        } else {
            equalsTwo = false;
        }
    }
}
