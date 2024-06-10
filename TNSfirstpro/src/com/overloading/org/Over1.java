package com.overloading.org;

public class Over1{
	float pointA;
	float pointB;
	
	public Over1() {
		
		System.out.println("This is Points Class");
	}
	
	public Over1(float pointA) {
		
		this.pointA = pointA;
		System.out.println("First Point: "+pointA);
	}
	
	public Over1(float pointA, float pointB) {
		
		this.pointA = pointA;
		this.pointB = pointB;
		System.out.println("Points: "+"( "+pointA+", "+pointB+" )");
	}
	
}