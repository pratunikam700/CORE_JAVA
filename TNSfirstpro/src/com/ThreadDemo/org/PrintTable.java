package com.ThreadDemo.org;

public class PrintTable {
	
	synchronized public void Printt(int n) {
		for(int i=0;i<n;i++) {
			
			System.out.println(n*i);
		}
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
