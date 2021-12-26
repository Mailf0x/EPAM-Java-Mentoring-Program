package com.epam;

public class Runner {

    public static void main(String[] args) {

        try {
            System.exit(1);
        } finally {
            System.out.println("Process exited with code 1");
        }
    }
}
