package com.MinMax.org;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public void FindMinMax(int [] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<1;i++) {
		System.out.println("The min element is:" +arr[i]);
		}
		for(int i=4;i>3;i--) {
			
			System.out.println("The max element is:" +arr[i]);
			}
			
		
		
	}
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
     
		MinMax m1=new MinMax();
		
		m1.FindMinMax(arr);
	}

}
