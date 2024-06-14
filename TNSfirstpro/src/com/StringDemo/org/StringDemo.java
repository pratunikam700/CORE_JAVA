package com.StringDemo.org;

public class StringDemo {

	public static void main(String args[]) {
	
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println("S1==s2? "+(s1==s2));//s1 and s2 pointing on same location
		System.out.println("S1==s3? "+(s1==s3));//returns false bcz both obj pointing on different location// s3 is initialise with new so it store in different heap memory not in poll
		System.out.println("S1.equals(s3)"+s1.equals(s3));//return true bcz equals() check the content
		String s4=s1;
		String s5=s3;
		String s6=new String(s3);
		String s7=s3.intern();//not create new instance it reffer past instance
		System.out.println("S1==s4? "+(s1==s4));
		System.out.println("S5==s3? "+(s5==s3));
		System.out.println("S6==s3? "+(s6==s3));
		System.out.println("S7==s3? "+(s7==s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s5.hashCode());
	//	System.out.println(s5.hashCode());
		System.out.println("-----------------------------------------");
		s1="Hi";//Directly allocate new memory allocation but in integer it is override the number
		s3="! How are you";
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("S1==s4? "+(s1==s4));
		System.out.println("S1==s3? "+(s1==s3));
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s5.hashCode());
		
	}
}
