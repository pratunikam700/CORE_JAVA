package com.GenericInterface.org;

public class Palimdrome <T>{// we can pass any type o value
      void display(T t){//generic method
    	 
    	  System.out.println("You entered:"+t);
    	  System.out.println("Type is:"+t.getClass());
      }
     boolean checkpalimdrome(T t) {
    	  if(t.getClass().getName().equals("java.lang.String")) {
    		  
    		  String s=t.toString();
    		  System.out.println(s);
    		 return s.equals(new StringBuffer(s).reverse().toString());
    	  }else if(t.getClass().getName().equals("java.lang.Integer")) {
    		  int n=Integer.parseInt(t.toString());
    		  int n1=n,rev=0;
    		  while(n!=0) {
    			  rev=rev*10+n%10;
    			  n=n/10;
    					  
    		  }
    		  return n1==rev;
    	  }
    	  else {
//    		  System.out.println("Not a string or integer");
    		  return false;
    	  }
     }
}
