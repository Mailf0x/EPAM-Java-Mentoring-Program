package com.epam;

public interface AnotherTestInterface {

    default void anotherMethod() {
        System.out.println("another method is running");
    }
}
