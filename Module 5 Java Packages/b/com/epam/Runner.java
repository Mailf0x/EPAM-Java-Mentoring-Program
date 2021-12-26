package com.epam;

public class Runner {

    public static void main(String[] args) {
    Class cls = java.lang.Object.class;
    Object obj = new Object();

    System.out.println("for class: " + cls.getName());
    System.out.println("for object: " + obj.getClass().getName());
    }
}
