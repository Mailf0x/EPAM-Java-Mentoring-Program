package com.epam;

public class Runner {

    public static void main(String[] args) {
	int[] arr = new int[8];

	System.out.println("int[] arr = new int[8]");
	arr[2] = 2;
	System.out.println("arr[2] = 2");
	System.out.print("arr[2]: ");
	System.out.println(arr[2]);
	System.out.println("arr.length: " + arr.length);
    }
}
