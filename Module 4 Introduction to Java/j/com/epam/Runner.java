package com.epam;

public class Runner {

    public static void main(String[] args) {
    Cat catA = new Cat();
    Cat catB = new Cat();

    System.out.println("catA.equals(catA): " + catA.equals(catA));
    System.out.println("catA.equals(catB): " + catA.equals(catB));
    System.out.println("catA.hashCode(): " + catA.hashCode());
    System.out.println("catA: " + catA.toString());
    System.out.println("catA.getClass(): " + catA.getClass());
    }
}
