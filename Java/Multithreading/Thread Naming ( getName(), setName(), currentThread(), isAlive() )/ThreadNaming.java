package com.ThreadNaming;

public class ThreadNaming extends Thread{
	
	@Override
	public void run() {
		System.out.println("ThreadNaming class thread task is done by : "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());	//true
	}

	public static void main(String[] args) {
		
		//It will return current thread name
		// Hello is printed by : main
		System.out.println("Hello is printed by : "+Thread.currentThread().getName());
		
		// We can also set the name current thread
		//in below i set the name of thread "Kajol" so, it will give output :
		// New Thread Name : Kajol
		Thread.currentThread().setName("Kajol");
		System.out.println("New Thread Name : "+Thread.currentThread().getName());
		
		
		//Output : ThreadNaming class thread task is done by : Thread-0
		// by default thread name is Thread-0, Thread-1 .....
		ThreadNaming t1 = new ThreadNaming();
		t1.start();
		
		//Output : Test class thread task is done by : Thread-1
		Test t2 = new Test();
		t2.start();
		
		//Output : Test class thread task is done by : Kaju
		Test t3 = new Test();
		t3.setName("Kaju");
		t3.start();
		
		System.out.println("Is thread alive : "+ t2.isAlive());	//true
		System.out.println(Thread.currentThread().isAlive());	//true
	}

}



