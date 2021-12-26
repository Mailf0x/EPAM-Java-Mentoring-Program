package com.epam;

public interface TestInterface {

    default void method() {
        System.out.println("method is running");
    }
}
