package com.ThreadDemo.org;

public class ChildThreadOne extends Thread{

	public void run() {
		Mytask.DisplayHello();
		Mytask.ShowEven();
	}
}
