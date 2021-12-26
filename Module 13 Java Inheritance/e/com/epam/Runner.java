package com.epam;

public class Runner extends Test {

    public static void method() {
        System.out.println("new method");
    }

    public static void main(String[] args) {
        Test.method();
        Runner.method();
    }
}
