/*
    Implement a generic constructor in non-generic class and create an
    object from it
*/

package com.epam;

public class Runner {

    public static void main(String[] args) {
        TestClass testClass = new TestClass<String>("string");
    }
}
