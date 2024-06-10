package com.ThreadDemo.org;

public class Demo {
  public static void main(String args[]) {
	  ThreadOne th1=new ThreadOne();
	  ThreadTwo th2=new ThreadTwo();
	  th1.start();
	  th2.start();
  }
}
