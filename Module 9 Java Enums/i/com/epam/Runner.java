package com.epam;

public class Runner {

    interface Printable {

        void print();
    }

    public enum Char implements Printable {
        A, B, C;

        public void print() {
            System.out.println(name());
        }
    }

    public static void main(String[] args) {}
}
