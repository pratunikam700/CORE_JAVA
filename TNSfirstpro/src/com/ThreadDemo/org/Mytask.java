package com.ThreadDemo.org;

public class Mytask {

	public static void DisplayHello() {
		System.out.println("Hello" +Thread.currentThread());
	}
	public static void ShowEven() {
		for(int i=0;i<50;i=i+2) {
			System.out.println(i+""+Thread.currentThread());
		}
	}
}
