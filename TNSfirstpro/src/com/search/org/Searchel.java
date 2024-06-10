package com.search.org;

public class Searchel {

	int arr[]= {3,5,8,9,1};
	
	
	public void Searchelement(int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				for(int a=0;a<1;a++) {
				System.out.println("Element is found at location:"+i);}
			}
			else {
				for(int a=0;a<1;a++) {
				System.out.println("Element not found");}
			}
		}
	}
	
	
}
