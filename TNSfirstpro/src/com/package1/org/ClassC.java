package com.package1.org;

public class ClassC extends ClassA {
	
	public ClassC() {
	
		System.out.println("Heloo Class c");
	}
	
	public static void main(String args[]) {
	ClassC c1=new ClassC();
	ClassA a1=new ClassA();
	 System.out.println(a1.b);
	}

}
