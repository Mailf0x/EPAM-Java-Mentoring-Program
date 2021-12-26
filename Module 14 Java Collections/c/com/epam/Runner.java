package com.epam;

public class Runner {

    public static void main(String[] args) {
        TestList<Integer> list = new TestList<>();

        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);

        for (Integer i : list) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}
