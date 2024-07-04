package com.UserdefinedInterface.org;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetInter obj=(s)->System.out.println("Hello" +s);
		obj.greet("Students");
		obj=(s)->System.out.println("Good morning!" +s);
		obj.greet("Students");
		
		System.out.println("_--------------------------------");
		ArithmaticInter opr;
		opr=(x,y)->x+y;
		int res=opr.perform(10, 20);
		System.out.println("Addition:"+res);
				
		opr=(x,y)->x-y;
		int res1=opr.perform(10, 20);
		System.out.println("Substraction:"+res1); //by using this only one method can perform multiple operation 
		
		opr=(x,y)->x*y;
		int res2=opr.perform(10, 20);
		System.out.println("Multiplication:"+res2);
		
		opr=(x,y)->{
			int p=1;
			while(y>0)
			{
				p=p*x;
				y--;
			}
			return p;
		};
		int res3=opr.perform(4, 3);
		System.out.println("Power:"+res3);
	}

}
