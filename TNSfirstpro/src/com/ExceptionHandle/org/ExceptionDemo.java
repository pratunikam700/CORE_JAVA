package com.ExceptionHandle.org;

public class ExceptionDemo extends Exception {

	public static void main(String[] args) {
		try {
			int a=15,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch( Exception e){
			System.out.println("Devide by zero exception:" +e.getMessage());
		}
     System.out.println("thiis is benefit of exception handling");
	}

}
