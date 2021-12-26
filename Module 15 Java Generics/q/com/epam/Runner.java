/*
    Implement a generic method with a method parameter of lower bounded
    wildcard type List<? super Integer>, that uses the method List.add to
    insert int elements to list; call the method with arguments of
    parameterized types List<Integer>, List<Number>, List<Object> (peCS:
    consumer - super)
*/

package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Number> anotherList = new ArrayList<>();
        List<Object> andAnotherList = new ArrayList<>();

        addElements(list);
        addElements(anotherList);
        addElements(andAnotherList);
        System.out.println(list);
        System.out.println(anotherList);
        System.out.println(andAnotherList);
    }

    public static void addElements(List<? super Integer> list) {

        for (int i = 2; i != 32; i *= 2) {
            list.add(i);
        }
    }
}
