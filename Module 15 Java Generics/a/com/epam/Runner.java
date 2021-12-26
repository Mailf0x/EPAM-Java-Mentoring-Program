/*
    Create an object of parameterized type List<Integer>, add Integer to
    it and get Integer from it
*/

package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        System.out.println(list.get(0));
    }
}
