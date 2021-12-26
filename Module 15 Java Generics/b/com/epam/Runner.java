/*
    Create an object of raw type List, add Integer to it and get Integer
    to it
*/

package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List list = new ArrayList<Integer>();

        list.add(2);
        System.out.println(list.get(0));
    }
}
