package com.epam;

public class Runner {

    public static void change(TestObject object) {
        object.setString("another string");
        object = new TestObject("and another string");
    }

    public static void main(String[] args) {
        TestObject object = new TestObject("string");

        change(object);
        System.out.println(object.getString());
    }
}
