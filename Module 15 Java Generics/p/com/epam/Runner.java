/*
    Implement a generic method with a method parameter of upper bounded
    wildcard type List<? extends Number>, that uses the method
    Number.longValue to find the sum of the list elements to an
    accumulator of type long; call the method with arguments of
    parameterized types List<Integer>, List<Long> (PEcs: producer -
    extends)
*/

package com.epam;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 8, 16);
        List<Long> anotherList = Arrays.asList(4L, 8L, 16L, 32L);

        System.out.println(sum(list));
        System.out.println(sum(anotherList));
    }

    public static long sum(List<? extends Number> list) {
        long result = 0;

        for (int i = 0; i != list.size(); i++) {
            result += list.get(i).longValue();
        }
        return result;
    }
}
