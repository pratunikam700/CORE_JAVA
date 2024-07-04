package com.StremApiDemo.org;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {10,20,40,30,55,35,65,95,80};
		Stream<Integer> s1=Arrays.stream(a);
		 Stream<Integer> even=s1.filter((n)->n%2==0);
		 even.forEach(System.out::println);
		 
		 s1=Arrays.stream(a);
		 Stream<Integer> filterstream=s1.filter((n)->n>=50);
		 filterstream.forEach(System.out::println);
		 
		 s1=Arrays.stream(a);
		 Predicate<Integer> oddpred=(n)->n%2!=0;
		 s1=s1.filter(oddpred);
		 s1.forEach(System.out::println);
		 

	}

}
