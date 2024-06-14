package com.StringDemo.org;

public class StringBuffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // String s="Buffer";
       StringBuffer sb;
       String s="Hello";
       System.out.println(s);
       sb=new StringBuffer("Hello");
       System.out.println(sb);
       sb.append("! How are you?");
       System.out.println(sb);
       sb.replace(0, 5, "Hi");
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);
      s=sb.toString();
      System.out.println(sb);
       
		
		
	}
}
