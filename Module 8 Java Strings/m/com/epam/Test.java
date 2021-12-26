package com.epam;

public class Test {

    @Override
    public String toString() {
        return String.format("{ object of Test class with hash: %d }", hashCode());
    }
}
