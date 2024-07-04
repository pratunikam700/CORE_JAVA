package org.testcases.businesslogic;

import java.io.BufferedReader;
import java.util.function.BooleanSupplier;

public class Operations {

	public static int add(int a,int b) {
		return a+b;
	}
	public static boolean getFactorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) 
			f=f*i;
			return true;
		
	}
	public static boolean isPalimdrome(int i) {
		// TODO Auto-generated method stub
		String str=Integer.toString(i);
		StringBuilder sb=new StringBuilder();
		 sb.append(str);
		 StringBuilder rev=sb.reverse();
		 if(str.contentEquals(rev)) {
			 return true;
		 }else {
		 return false;
		 }
		
	}
}
