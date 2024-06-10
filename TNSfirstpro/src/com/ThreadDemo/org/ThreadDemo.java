package com.ThreadDemo.org;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
		}
		
		Mytask t1=new Mytask();
		t1.DisplayHello();
		t1.ShowEven();
	}

}
