package com.epam;

public class Runner extends Test {

    public Runner() {
        super();
    }

    public void anotherMethod() {
        super.method();
        System.out.println(super.field);
    }
}
