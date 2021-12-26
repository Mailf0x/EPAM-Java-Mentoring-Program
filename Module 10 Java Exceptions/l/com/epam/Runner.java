package com.epam;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        try (Scanner a = new Scanner(System.in)) {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.err.println("Catched ArithmeticException");
        }
    }
}
