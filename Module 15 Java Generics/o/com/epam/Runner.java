/*
    Implement a generic method with a method parameter of unbounded
    wildcard type List<?>, that uses the method System.out.println to
    print list elements; call the method with arguments of parameterized
    types List<Object>, List<Integer>, List<Double>
*/

package com.epam;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Object> list = Arrays.asList("object A", "object B", "object C");
        List<Integer> anotherList = Arrays.asList(4, 8, 16, 32);
        List<Double> andAnotherList = Arrays.asList(2.4, 4.8, 8.16, 16.32, 32.64);

        print(list);
        print(anotherList);
        print(andAnotherList);
    }

    public static void print(List<?> list) {
        System.out.println("[");

        for (int i = 0; i != list.size(); i++) {
            System.out.print("    ");
            System.out.println(list.get(i));
        }
        System.out.println("]");
    }
}
