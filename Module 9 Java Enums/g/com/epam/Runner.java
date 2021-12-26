package com.epam;

import java.util.Arrays;

public class Runner {

    public enum Char {
        A('a'), B('b'), C('c');

        private char body;

        Char(char body) {
            this.body = body;
        }

        public char getBody() {
            return body;
        }
    }

    public static void main(String[] args) {}
}
