/*
    Implement a generic method with bounded type parameter <T extends
    Number>, with a method parameter of generic type parameter List<T>,
    that uses the method Number.longValue to find the sum of the list
    elements to an accumulator of type long; call the method with
    arguments of parameterized types List<Integer>, List<Long>
*/

package com.epam;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 8, 16);
        List<Long> anotherList = Arrays.asList((long)4, (long)8, (long)16,
            (long)32);

        System.out.println(sum(list));
        System.out.println(sum(anotherList));
    }

    public static <T extends Number> long sum(List<T> list) {
        long result = 0;

        for (T t : list) {
            result += t.longValue();
        }
        return result;
    }
}
