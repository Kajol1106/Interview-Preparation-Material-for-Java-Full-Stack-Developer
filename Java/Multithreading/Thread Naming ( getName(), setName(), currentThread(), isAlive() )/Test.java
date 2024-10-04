package com.ThreadNaming;

public class Test extends Thread{

	@Override
	public void run() {
		System.out.println("Test class thread task is done by : "+Thread.currentThread().getName());
	}
	
}
