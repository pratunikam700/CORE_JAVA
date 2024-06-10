package com.ThreadDemo.org;

public class ThreadTwo extends Thread {
  
	 PrintTable t2=new PrintTable();  
	  
		 public void run() {
			t2.Printt(100);
		}
//	 public void run() {
//    	 while(true) {
//    		 System.out.println("Hi, Good Morning!! I am fine");
//    		 
//    	 }
//     }
}
