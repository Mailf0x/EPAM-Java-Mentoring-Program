package com.epam;

import java.io.Console;

public class Runner {

    public static void main(String[] args) {
        Console console = System.console();
        String itsAn = "It's an ";
        String input = console.readLine();

        switch (input) {
        case "apple":
        case "orange":
        case "potato":
            System.out.println(itsAn + input);
            break;
        default:
            System.out.println("I don't know what is it");
        }
    }
}
