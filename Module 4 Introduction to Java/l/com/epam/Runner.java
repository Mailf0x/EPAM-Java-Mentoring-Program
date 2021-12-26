package com.epam;

public class Runner {

    public static void main(String[] args) {
	int hashCode;
	Object obj = null;

	hashCode = obj.hashCode();
	System.out.println("hashCode: " + hashCode);
    }
}
