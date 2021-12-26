package com.epam;

public interface Test {

    default void method() {
        System.out.println("method is running");
    }
}
