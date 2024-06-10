package com.finaldemo.org;

public class FinalDemo {

	int x;
	final int y=10;
	final int z;
	static final int a=20;
	public FinalDemo(){
	   x++;
	   z=20;
	   
	   
	//	y++; //can't make any changes it declare as a final 
	}
	public FinalDemo(int value){
		
		x=value;
		z=value;
		
		
	
	//	y++; //can't make any changes it declare as a final 
	}
	@Override
	public String toString() {
		return "FinalDemo [x=" + x + ", y=" + y + ", z=" + z + ",a= "+a+"]";
	}
	
	
	
}
