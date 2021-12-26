package com.epam;

public class Runner {

    interface Printable {

        void print();
    }

    public enum Char implements Printable {
        A('a'), B('b'), C('c');

        private char body;

        private Char(char body) {
            this.body = body;
        }

        public void print() {
            System.out.println(body);
        }
    }

    public static void main(String[] args) {
        Char ch = Char.C;

        // kinda solution
        switch (ch) {
            case A:
                System.out.println('a');
                break;
            case B:
                System.out.println('b');
                break;
            case C:
                System.out.println('c');
        }

        // simpler solution
        ch.print();
    }
}
