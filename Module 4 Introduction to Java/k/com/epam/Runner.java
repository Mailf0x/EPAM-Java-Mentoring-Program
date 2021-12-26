package com.epam;

public class Runner {

    public static void main(String[] args) {
	Cat cat = new Cat();
	Class cls = cat.getClass();
	Package pkg = cls.getPackage();
	String name = cls.getName();;

	System.out.println("cls.getName(): " + name);
	System.out.println("cls.getPackage(): " + pkg);
    }
}
