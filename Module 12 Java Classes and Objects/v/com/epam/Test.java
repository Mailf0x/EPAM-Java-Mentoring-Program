package com.epam;

public class Test {

    public Test() {
        System.out.println("constructor's running");
    }

    {
        System.out.println("instance block's running");
    }

    static {
        System.out.println("static block's running");
    }
}
