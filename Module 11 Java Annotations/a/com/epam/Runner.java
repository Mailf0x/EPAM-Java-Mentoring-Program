package com.epam;

import java.io.PrintStream;

public class Runner {

    /**
     * @deprecated This method is deprecated.
     * @see {@link com.epam.Runner#print}
     */
    @Deprecated
    public static void print(String s) {
        System.out.print(s);
    }

    public static void print(String s, PrintStream ps) {
        ps.print(s);
    }

    public static void main(String[] args) {}
}
