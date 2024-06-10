package com.tnsfirst.org;

public class PointDemo {
  
	private float x,y;
	public PointDemo() {
		x=0.0f;
		y=0.0F;
		//System.out.println(x);
		//System.out.println(y);
	}
	public PointDemo(float X) {
		x=X;
		//System.out.println(x);
		//System.out.println(y);
	}
	public PointDemo(float a,float b) {
		x=a;
		y=b;
		//System.out.println(x);
		//System.out.println(y);
	}
	public void setX(float value) {
		x=value;
	}
	public float getX() {
		return x;
	}
	public void setY(float value) {
		y=value;
	}
	public float getY() {
		return y;
	}
	
	public void Show() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
}
