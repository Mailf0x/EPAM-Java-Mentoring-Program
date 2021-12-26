package com.epam;

public class Runner extends TestClass implements TestInterface,
    AnotherTestInterface {

    public void interfaceMethod() {
        System.out.println("interface method is running");
    }

    public void anotherInterfaceMethod() {
        System.out.println("another interface method is running");
    }

    public void method() {

        if (this instanceof TestClass) {
            classMethod();
        }
    }

    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.method();
    }
}
