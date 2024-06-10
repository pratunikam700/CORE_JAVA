package com.tnsfirst.org;

public class Point {
  public static void main(String args[]) {
	  
	  PointDemo p1=new PointDemo();
	  p1.Show();
	  PointDemo p2=new PointDemo(23);
	  p2.Show();
	  
	  PointDemo p3=new PointDemo(20.50f,60.40f);
	  p3.Show();
	  
	  p3.setX(19.29f);
	  p3.setY(15.50f);
	  System.out.println(p1.getX()+","+p1.getY());
	  p3.Show();
  }
}
