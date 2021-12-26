package com.epam;

public class Runner {

    public static void main(String[] args) {
        System.out.print("[ ");

        for (int i = 0; i != args.length; i++) {
            boolean lastElement = i == args.length - 1;

	    System.out.print(args[i]);

	    if (!lastElement) {
		System.out.print(", ");
	    }
	}
	System.out.print(" ]");
    }
}
