package com.Linklistdemo.org;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> cl=new LinkedList<String>();
		cl.add("Nashik");// adding the element
		cl.add("Pune");
		cl.add("Mumbai");
		System.out.println(cl);
		System.out.println("-----------------------");
		cl.add(2,"Delhi");// used to add element at 2 loacation
		System.out.println(cl);
		System.out.println("-----------------------");
		cl.addFirst("Hydrabad");//add element at first position
		cl.addLast("Chennai");//add element at last position
		System.out.println(cl);
		System.out.println("-----------------------");
		System.out.println("First City: "+cl.getFirst());//fetch the element which present at first location
		System.out.println("Last City: "+cl.getLast());//fetch the element which present at last location
		System.out.println("City: "+cl.get(2));//fetch the element which present at 2 location
		System.out.println("Removed city at 2 location:" +cl.remove(3));//remove the element which is present at 3 location
		System.out.println(cl);
		System.out.println("Mumbai city removed?:" +cl.remove("Mumbai"));//returns true if present and remove the element
		System.out.println("Mumbai city removed?:" +cl.remove("Mumbai"));//returns false bcz it is not present also we used removeFirst(),removeLast() method to remove fisrt and last element
		//cl.clear(); used to delete all element and the if we want to remove element from empty list then it throw the exception Nosuchelement exception
		
		ListIterator<String> lit=cl.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next().toUpperCase());// we can insert or modify the element at iteration
		    //String city=lit.next();
//			if(city.equals("Mumbai"))
//				lit.remove();
		}
		System.out.println("-------------------------------------------------");
		
		lit=cl.listIterator();
		while(lit.hasNext()) {
			
			String city=lit.next();
			if(city.equals("Nashik"))
				lit.set("nasik");
			if(city.equals("pune"))
				lit.remove();
		}
		System.out.println(cl);
		System.out.println("-------------------------------------------------");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());//traverse the past element
		}
		System.out.println(cl);
		
		
		
	}

}
