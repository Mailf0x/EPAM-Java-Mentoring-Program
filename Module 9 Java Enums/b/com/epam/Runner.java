package com.epam;

public class Runner {

    public enum Char_Enum {
        A, B, C;

        @Override
        public String toString() {
            return name().toLowerCase().replaceAll("_", " ");
        }
    }

    public static void main(String[] args) {}
}
