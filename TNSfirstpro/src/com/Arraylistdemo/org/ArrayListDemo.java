package com.Arraylistdemo.org;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String args[]) {
		//Raw list heterogeneous element
		ArrayList a=new ArrayList();
		a.add(new Integer(22));//It is used in older version of java ,there is no need to declare like that
		a.add(new Character('a'));
		a.add(70);
		a.add(30);
		a.add("hello");
		a.add(new Float(2.2f));
		System.out.println(a);
		System.out.println(a.add(100));//returns true
		System.out.println("The size of arraylist is:" +a.size());
		a.add(30);
		System.out.println(a);
		System.out.println("The size of arraylist is:" +a.size());
		System.out.println("Is 10 present:" +a.contains(10));//returns true if element present otherwise return false
		System.out.println("Is 10 present:" +a.indexOf(30));//return the index of that element, if element not present return -1 
		System.out.println("Is 30 present:" +a.lastIndexOf(30));//return the last index of element
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//a.remove(10);//int this 10 is a index so it throw the error IOB exception
		System.out.println(a.remove(a.indexOf(30)));//remove the 30 
		System.out.println(a.remove(String.valueOf("hello")));
//		Collections.sort(a); //Throw the exception bcz list have a different type of value
//		System.out.print("List after sorting");
//		
		
		Iterator i=a.iterator();
		System.out.println("---------------------");
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println(a.isEmpty());
		
		System.out.println(a.get(0));// this get method is used to fetch the element fastly.
		System.out.println(a.get(a.size()-1));// give a last element of list.
	     
	}
}
