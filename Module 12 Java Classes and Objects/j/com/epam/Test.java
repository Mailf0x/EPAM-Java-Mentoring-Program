package com.epam;

public class Test {

    static {
        System.out.println("class has been loaded");
    }

    {
        System.out.println("object has been created");
    }
}
