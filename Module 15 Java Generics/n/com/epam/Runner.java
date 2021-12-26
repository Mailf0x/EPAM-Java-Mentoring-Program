/*
    Implement a generic method with a method parameter of parameterized
    type List<Object>, that uses the method System.out.println to print
    list elements; call the method with an argument of parameterized type
    List<Object>
*/

package com.epam;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Object> list = Arrays.asList("string", "another string",
            "and another string");

        print(list);
    }

    public static void print(List<Object> list) {
        System.out.println("[");

        for (Object o : list) {
            System.out.print("    ");
            System.out.println(o);
        }
        System.out.println("]");
    }
}
