package com.ThreadDemo.org;

public class ThreadOne extends Thread{
    
	 PrintTable t=new PrintTable();  
	  
	public void run() {
		t.Printt(10);
	}
//    	 while(true) {
//    		 System.out.println("Hello, How are you?");
//    		 
//    	 }
    	
    	 
     
	 
}
