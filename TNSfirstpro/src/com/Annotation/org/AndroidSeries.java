package com.Annotation.org;

@SmartTV(os= "Android",price=80000)
public class AndroidSeries {

	String model;
	int screenSize;
	int price;
	public AndroidSeries(String model, int screenSize, int price) {
		super();
		this.model = model;
		this.screenSize = screenSize;
		this.price=price;
	}
	@Override
	public String toString() {
		return "AndroidSeries [model=" + model + ", screenSize=" + screenSize + price+"]";
	}
	
	
}
