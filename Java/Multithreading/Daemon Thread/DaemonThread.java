package com.DaemonThread;

public class DaemonThread extends Thread {
	@Override
	public void run() {
//		if(Thread.currentThread().isDaemon()) {
//			System.out.println("Daemon thread...");
//		}
//		else {
//			System.out.println("Child thread(not daemon thread) ...");
//		}
		
		System.out.println("daemon thread...");
	}

	public static void main(String[] args) {
		
		//Thread.currentThread().setDaemon(true);	//it's not possible. It will throw error
		//because main thread already started the thread. It will trow exception illegal
		
		System.out.println("Main thread ...");
		
		DaemonThread t1 = new DaemonThread();
		t1.setDaemon(true);
		t1.start();

	}

}
