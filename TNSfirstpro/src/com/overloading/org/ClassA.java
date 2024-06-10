package com.overloading.org;

public class ClassA{

	public static void add() {
		System.out.println("This is default constructor");
	}
	public static void add(int a) {
		System.out.println(+a);
	}
	public static void add(int a,int b) {
		System.out.println("Addition is :"+(a+b));
	}
}
