package com.inhe1.org;

public class PersonTeacherDemo {
public static void main(String args[]) {
	Person p1=new Person();
	p1.show();
	System.out.println("-----------------------------------------------------------------------");
	
	Person p2=new Person("pratu","nashik",(byte)22);
	p2.show();
	System.out.println("-----------------------------------------------------------------------");
	
	Teacher t1=new Teacher();
	t1.show();
	System.out.println("-----------------------------------------------------------------------");
	
	Teacher t2=new Teacher("Pratu","Nashik",(byte)45,"BE","cc",1);
	t2.show();
	System.out.println("-----------------------------------------------------------------------");
}
}
