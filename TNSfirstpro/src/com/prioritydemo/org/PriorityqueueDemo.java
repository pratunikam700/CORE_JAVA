package com.prioritydemo.org;

import java.util.PriorityQueue;

public class PriorityqueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);//compaes with frst element
		pq.add(30);
		pq.add(20);
		pq.add(5);
		pq.add(100);
		pq.add(60);
		System.out.println(pq);
		while(!pq.isEmpty()) {
			
			System.out.println(pq.remove());
		}
		System.out.println(pq);
	}

}
