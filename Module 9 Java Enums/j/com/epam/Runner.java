package com.epam;

public class Runner {

    public enum Char {
        A('a'), B('b'), C('c');

        private char body;

        private Char(char body) {
            this.body = body;
        }

        public String getBody() {
            return body;
        }
    }

    public static void main(String[] args) {
        Char ch = Char.B;
        char c;

        // kinda solution
        switch (ch) {
            case A:
                c = 'a';
                break;
            case B:
                c = 'b';
                break;
            case C:
                c = 'c';
        }

        // simpler solution
        c = ch.getBody();
    }
}
