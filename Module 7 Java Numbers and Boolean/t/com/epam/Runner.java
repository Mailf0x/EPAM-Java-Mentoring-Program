package com.epam;

import java.math.BigDecimal;

public class Runner {

    public static void main(String[] args) {
        BigDecimal ten = BigDecimal.TEN;
        BigDecimal one = BigDecimal.ONE;

        System.out.println("TEN + ONE: " + ten.add(one));
        System.out.println("TEN - ONE: " + ten.subtract(one));
        System.out.println("TEN * ONE: " + ten.multiply(one));
        System.out.println("TEN / ONE: " + ten.divide(one));
    }
}
