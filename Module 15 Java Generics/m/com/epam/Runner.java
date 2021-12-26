/*
    Assign objects of types ArrayList<Integer>, ArrayList<Number>,
    ArrayList<Object> to reference of lower bounded wildcard type
    List<? super Integer>
*/

package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Integer>();
        List<? super Integer> anotherList = new ArrayList<Number>();
        List<? super Integer> andAnotherList = new ArrayList<Object>();
    }
}
