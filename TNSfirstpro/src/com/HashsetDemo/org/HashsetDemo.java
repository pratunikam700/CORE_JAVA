package com.HashsetDemo.org;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Integer> set1=new HashSet<Integer>();
        set1.add(10);
        set1.add(30);
        set1.add(20);
        set1.add(5);
        set1.add(100);
        set1.add(60);
        System.out.println(set1);//does not allow for duplicate value
		
        HashSet<Integer> set2=new HashSet<Integer>();
        set2.add(10);
        set2.add(30);
        set2.add(22);
        set2.add(55);
        set2.add(11);
        set2.add(60);
        System.out.println("Second set :" +set2);
        
        set1.addAll(set2);// perform the union operation
        System.out.println("First set :" +set1);
        System.out.println("Second set :" +set2);
        
        set1.removeAll(set2);//remove matching element from set1 perform set difference
        System.out.println(" set dif First set :" +set1);
        System.out.println("Second set :" +set2);//retainall perform intersection
        
        set1.clear();
        set1.add(10);
        set1.add(30);
        set1.add(20);
        set1.add(5);
        set1.add(100);
        set1.add(60);
        System.out.println("First set :" +set1);
        System.out.println("Second set :" +set2);
        System.out.println("_________________");
        
        set1.retainAll(set2);
        System.out.println("First set intersection :" +set1);
        System.out.println("Second set :" +set2);
        
       
        
        
        
        
	}

}
