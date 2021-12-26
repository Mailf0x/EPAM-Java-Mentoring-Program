package com.epam;

import java.math.BigInteger;

public class Runner {

    public static void main(String[] args) {
        BigInteger ten = BigInteger.TEN;
        BigInteger one = BigInteger.ONE;

        System.out.println("TEN + ONE: " + ten.add(one));
        System.out.println("TEN - ONE: " + ten.subtract(one));
        System.out.println("TEN * ONE: " + ten.multiply(one));
        System.out.println("TEN / ONE: " + ten.divide(one));
    }
}
