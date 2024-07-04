package com.GenericInterface.org;

public class GenericMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palimdrome obj=new Palimdrome();
		obj.display(10);
		obj.display("Snehu");
		obj.display(true);
		obj.display(10.2F);
		
//		Palimdrome obj1=new Palimdrome();
//		obj1.checkpalimdrome("Hello");
		System.out.println("Is 10 palimdrome:"+obj.checkpalimdrome(10));
		System.out.println("Is 101 palimdrome:"+obj.checkpalimdrome(101));
		System.out.println("Is 101 string palimdrome:"+obj.checkpalimdrome("101"));
		System.out.println("Not a string or integer:"+obj.checkpalimdrome(10.20F));
	}

}
