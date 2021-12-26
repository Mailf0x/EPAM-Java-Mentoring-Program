/*
    Create an object of generic type ArrayList<T> with actual type
    parameter Integer without and with diamond operator
*/

package com.epam;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> anotherList = new ArrayList<>();
    }
}
