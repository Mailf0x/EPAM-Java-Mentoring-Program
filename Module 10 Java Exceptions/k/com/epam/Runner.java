package com.epam;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        try {
            throw new NullPointerException();
        } finally {
            a.close();
        }
    }
}
