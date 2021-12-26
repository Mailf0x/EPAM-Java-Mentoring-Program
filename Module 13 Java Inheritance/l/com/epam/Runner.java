package com.epam;

public class Runner {
    private Test test;

    public Runner(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return test;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Runner runner = new Runner(test);

        runner.getTest().method();
    }
}
