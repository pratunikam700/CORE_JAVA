package com.LinkedHashDemo.org;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> Cs=new TreeSet<String>();//add element with sorting in ascending order
        Cs.add("Java");
        Cs.add("C++");
        Cs.add("python");
        Cs.add("C");
        Cs.add("React");
        Cs.add("Angular");
        
        System.out.println(Cs);
        System.out.println("First: " +Cs.first());
        System.out.println("Last: " +Cs.last());
        
        Cs.remove("C");//remove c from treeset
        System.out.println(Cs);
        
        Cs.pollFirst();//remove first element 
        System.out.println(Cs);
        
        Cs.pollLast();//remove last element
        System.out.println(Cs);
        
       // Cs.add(null); gives us nullpointer exception
        
        System.out.println("______________________________________");
        
        Comparator<Employee> comp=(e1,e2)->e1.getEmpId()-e2.getEmpId();
        
        TreeSet<Employee> empSet=new TreeSet<Employee>(comp);
        
        empSet.add(new Employee(101,"Prathmesh", 73000));
        empSet.add(new Employee(102,"Sejal", 100000));
        empSet.add(new Employee(103,"Avantika", 70000));
        
        System.out.println("Employee details:: \n" +empSet);
        
	}

}
