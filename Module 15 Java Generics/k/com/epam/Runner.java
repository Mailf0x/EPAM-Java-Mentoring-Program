/*
    Assign objects of types ArrayList<Integer>, ArrayList<Double>,
    ArrayList<String> to reference of unbounded wildcard type List<?>
*/

package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
        List<?> anotherList = new ArrayList<Double>();
        List<?> andAnotherList = new ArrayList<String>();
    }
}
