package com.epam;

public class Runner {

    public static void main(String[] args) {
	int[] arr = new int[]{0};
	boolean equals = arr.equals(arr);
	boolean instanceOf = arr instanceof Object;
	int hashCode = arr.hashCode();
	String toString = arr.toString();

	System.out.println("toString: " + toString);
	System.out.println("hashCode: " + hashCode);
	System.out.println("equals(self): " + equals);
	System.out.println("instanceof Object: " + instanceOf);
    }
}
