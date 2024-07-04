package com.Annotation.org;

import java.text.Annotation;
import java.util.ArrayList;

public class AnnoDemo {
    // @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("rawtypes")
       ArrayList list=new ArrayList();
	   
	AndroidSeries obj=new AndroidSeries("A23",14,8000);
	System.out.println(obj.model);
	System.out.println(obj.screenSize);
	Class c=obj.getClass();
	System.out.println("SmartTv details");
	
	java.lang.annotation.Annotation an= c.getAnnotation(SmartTV.class);
	
	SmartTV s1=(SmartTV) an;
	System.out.println(s1.os());
	System.out.println(s1.price());
	
	}

}
