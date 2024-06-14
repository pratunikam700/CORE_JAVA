package com.Arraylistdemo.org;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class HomegeneousList {

	public static void main(String args[]) {
		//Create String type list
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Pratiksha");
		nameList.add("Kunal");
		nameList.add("Avantika");
		nameList.add("Yukta");
		//nameList.add(10); // other than string not allowed , give compile time error
		System.out.println("List is:"+nameList);
		Collections.sort(nameList);
		System.out.println("List ater sorting:" +nameList);
		
		//Create Person list
		ArrayList<Person> Pl=new ArrayList<Person>();
		Pl.add(new Person("Pratu","Nashik", 9175817521L));
		Pl.add(new Person("Avantika","Nashik", 9178917521L));
		Pl.add(new Person("Sneha","Pune", 9175817521L));
		System.out.println("Person List :" +Pl);
		//Collections.sort(Pl);
		
		Iterator<Person> i=Pl.iterator();//read one by one record
		System.out.println("______________________");
		//i.remove(); we can remove element during iterator
		//we can also modify the list during iterator
		while(i.hasNext())
		{
			Person p=i.next();
			System.out.println("person is:"+p);
		}
		System.out.println("----------------------------------------------");
		Comparator<Person> comp=(p2,p1)->p1.getName().compareTo(p2.getName());//for ascending we need exchange the position as p1,p2
		Collections.sort(Pl,comp);
		System.out.println("Ascending :"+Pl);
		//comparator functional interface does not affect to main program
		
		comp=(p2,p1)->(int)(p1.getContactNo()-p2.getContactNo());
		Collections.sort(Pl,comp);
		System.out.println("Ascending contact :"+Pl);
		
	
	}
}
