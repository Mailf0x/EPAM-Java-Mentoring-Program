package com.epam;

public class Runner {

    public static void main(String[] args) {
        Test a = new Test();

        Test.staticMethod();
        a.instanceMethod();
    }
}
