package com.LinkedHashDemo.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String args[]) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();//in hashset randomely insert the element hash unction is used rather than in linkedhashset add element in order
		lhs.add(20);
		lhs.add(10);
		lhs.add(60);
		lhs.add(100);
		System.out.println(lhs);
		
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext())
			System.out.println(it.next()+"\t");
		
		System.out.println("Size: "+lhs.size());
		//lhs.remove(100);//returns true and removr 100
		//lhs.remove(50);//not present in hashset bu dont show error
		System.out.println(lhs);
		
		//sort() is not applicable in linkedhashset we need to convert it into list first
		
		ArrayList<Integer> a=new ArrayList<Integer>(lhs);//give lhs as argument bcz we create list for hashset
		System.out.println(a);
		Collections.sort(a);
		System.out.println("After sorting:" +a);
		
		lhs=new LinkedHashSet<Integer>(a);
		System.out.println(lhs);
		
	}
}
