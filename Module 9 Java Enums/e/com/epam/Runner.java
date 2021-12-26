package com.epam;

import java.util.Optional;

public class Runner {

    public enum Char {
        A, B, C;
    }

    public static void main(String[] args) {
        System.out.print("Char name: ");
        String input = System.console().readLine();
        Optional<Char> result = Optional.empty();

        for (Char c : Char.values()) {
            if (c.name().equals(input)) {
                result = Optional.of(c);
                break;
            }
        }
        System.out.println(result.get());
    }
}
