package com.epam;

import java.util.List;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        List<Error> list = new ArrayList<>();

        list.add(new AbstractMethodError());
        list.add(new AssertionError());
        list.add(new BootstrapMethodError());
        list.add(new ClassCircularityError());
        list.add(new ClassFormatError());
        for (Error e : list) {
            try {
                throw e;
            } catch (Error e) {
                System.out.println("It's an error");
            }
        }
    }
}
