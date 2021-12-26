package com.epam;

import java.math.BigDecimal;

public class Runner {

    public static void main(String[] args) {
        BigDecimal oneA = new BigDecimal("1.0");
        BigDecimal oneB = new BigDecimal("1.00");

        System.out.println("oneA.equals(oneB): " + oneA.equals(oneB));
        System.out.println("oneA.compareTo(oneB): " + (oneA.compareTo(oneB) == 0 ? "true" : "false"));
    }
}
