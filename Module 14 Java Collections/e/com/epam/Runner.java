package com.epam;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 8, 16, 32};
        List<Integer> list = Arrays.asList(array);
        Object[] anotherArray = list.toArray();
        Integer[] andAnotherArray = list.toArray(array);
    }
}
