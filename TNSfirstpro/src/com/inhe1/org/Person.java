package com.inhe1.org;

public class Person {
   
	private String name;
	private String city;
	private byte age;
	 
	public Person() {
		System.out.println("Person: default construtor");
	}
	public Person(String name, String city, byte age) {
		this.name=name;
		this.city=city;
		this.age=age;
		
	}
	public void show() {
		System.out.println("Name:"+name+"city:"+city+"age:"+age);
	}

}
