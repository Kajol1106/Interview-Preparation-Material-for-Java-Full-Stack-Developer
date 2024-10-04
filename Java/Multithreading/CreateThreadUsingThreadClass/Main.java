package com.CreateThreadUsingThreadClass;

public class Main {
	public static void main(String[] args) {
		//Performing multiple task from multiple Thread :
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}
}


//Performing single task from single Thread :
//public static void main(String[] args) {
//	Thread1 t1 = new Thread1();
//	t1.start();
//}


//Performing single task from multiple Thread :
//public static void main(String[] args) {
//	Thread1 t1 = new Thread1();
//	t1.start();
//Thread1 t2 = new Thread1();
//t2.start();
//}
