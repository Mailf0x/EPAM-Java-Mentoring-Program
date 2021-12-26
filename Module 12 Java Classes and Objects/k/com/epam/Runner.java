package com.epam;

public class Runner {

    public static void main(String[] args) {
        Test a = new Test();

        System.out.println(Test.STATIC_VARIABLE);
        System.out.println(a.instanceVariable);
    }
}
