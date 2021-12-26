package com.epam;

import java.util.List;
import java.util.Arrays;

public class Loop {

    public void methodWithFor() {

        for (int i = 0; i != 8; i++) {
            System.out.printf("i: %d%n", i);
        }
    }

    public void anotherMethodWithFor() {

        for (int a = -5, i = 0; a > -25 && i < 10; a -= 2, i++) {
            System.out.printf("a: %d, i: %d%n", a, i);
        }
    }

    public void methodWithForeach() {
        int[] arr = new int[8];
        enum Literal {A, B, C, D}
        List<Integer> list = Arrays.asList(0, 0, 0, 0);

        for (int a : arr) {
            System.out.println(a);
        }

        for (Literal l : Literal.values()) {
            System.out.println(l);
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public methodWithWhile() {
        int i = 10;

        while (i > 0) {
            System.out.printf("i: %d%n", i);
            i--;
        }
    }

    public void methodWithDowhile() {
        int i = -10;

        do {
            System.out.printf("i: %i%n", i);
            i++;
        } while(i < 0);
    }

    public void methodWithBreak() {

        for(int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
        }
    }

    public void anotherMethodWithBreak() {
        main:
        for(int i = 0; i != 10; i++) {
            for(int j = -10; j != 0; j++) {
                if (j == 5 && i == 5) {
                    break main;
                }
            }
        }
    }

    public void methodWithInfiniteFor() {

        for(;;) {}
    }

    public void methodWithInfiniteWhile() {

        while(true) {}
    }

    public void methodWithContinue() {

        for(int i = 0; i != 10; i++) {

            if(i == 5) {
                continue;
            }
        }
    }

    public void anotherMethodWithContinue() {
        main:
        for(int i = 0; i > -10; i++) {
            for(int j = 10; j > 0; j--) {
                if (j == 5 && i == 5) {
                    continue main;
                }
            }
        }
    }

    public void methodWithIfThen(int a) {

        if (a == 2) {
            System.out.println("It's two");
        }
    }

    public void methodWithIfThenElse(int a) {

        if (a == 4) {
            System.out.println("It's four");

        } else {
            System.out.println("It's not four");
        }
    }

    public void methodWithSwitch(int a) {

        switch (a) {
        case 1:
            System.out.println("It's one");
            break;
        case 2:
            System.out.println("It's two");
        default:
            System.out.println("error: unsupported value");
        }
    }

    public void anotherMethodWithSwitch(int a) {

        switch (a) {
        case 1:
        case 2:
        case 3:
            System.out.println("It's between 1 and 3");
            break;
        default:
            System.out.println("error: unsupported value");
        }
    }

    public int methodWithReturn() {
        return 5;
    }

    public void anotherMethodWithReturn() {
        return;
    }
}
