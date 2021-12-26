package com.epam;

public class TestClass {

    public TestClass() {}

    public <T> TestClass(T object) {
        System.out.println(object);
    }
}
