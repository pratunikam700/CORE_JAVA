package com.ArrDemo.org;

import java.util.*;

public class Arrclass {

	public static void main(String args[]) {
		int arr[]=new int[5];
		int key=4;
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
		Arrays.sort(arr);
		int s1=Arrays.binarySearch(arr,key);
		 for(int i=0;i<arr.length;i++) {
		    	System.out.println("Elements are:" +arr[i]);
		    }
		 System.out.println("elements at location :"+s1);
	}
}
