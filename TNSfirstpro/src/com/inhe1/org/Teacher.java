package com.inhe1.org;

public class Teacher extends Person {
       
	 String Qualification;
	 String subject;
	 int exp;
	public Teacher() {
		System.out.println("Person: default construtor");
		
	}
	public Teacher(String name, String city, byte age) {
		super(name, city, age);
		System.out.println("Teacher : parameterise constructor");
	}
	 public Teacher(String name,String city,byte age,String Qualification, String subject,int exp) {
		 super(name,city,age);
		 this.Qualification=Qualification;
		 this.subject=subject;
		 this.exp=exp;
		 System.out.println("Teacher : parameterise constructor");
		 
		 
		 
	 }
	 public void show() {
		 super.show();
		 System.out.println("Qualification:"+Qualification+"subject:"+subject+"exp:"+exp);
	 }
}
