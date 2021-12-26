/*
    Assign objects of types ArrayList<Integer>, ArrayList<Double> to
    reference of upper bounded wildcard type List<? extends Number>
*/

package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        List<? extends Number> anotherList = new ArrayList<Double>();
    }
}
