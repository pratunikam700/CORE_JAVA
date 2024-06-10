package com.ThreadDemo.org;

public class MultiThreaded {

	public static void main(String[] args) {
	System.out.println("----------in main function()" +Thread.currentThread());	
	ChildThreadOne c1=new ChildThreadOne();
	ChildThreadOne c2=new ChildThreadOne();
	ChildThreadOne c3=new ChildThreadOne();
	c1.start();
	c2.start();
	c3.start();

	}

}
