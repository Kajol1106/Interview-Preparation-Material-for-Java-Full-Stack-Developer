package com.Priorites;

public class ThreadPriorities extends Thread {
	
	@Override
	public void run() {
		System.out.println("child thread...");
		System.out.println("child thread priority : "+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		//Default Priority of Main thread : 5
		System.out.println("Default Priority of Main thread : "+Thread.currentThread().getPriority());
		
		//New Priority of Main thread : 8
		Thread.currentThread().setPriority(8);
		System.out.println("New Priority of Main thread : "+Thread.currentThread().getPriority());
		
		//child thread...
		//child thread priority : 8
		ThreadPriorities t1 = new ThreadPriorities();
		t1.start();
	}

}
