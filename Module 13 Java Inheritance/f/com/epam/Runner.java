package com.epam;

public class Runner extends Test {

    public void method() {
        System.out.println("new method");
    }

    public static void main(String[] args) {
        Test test = new Runner();

        test.method();
    }
}
