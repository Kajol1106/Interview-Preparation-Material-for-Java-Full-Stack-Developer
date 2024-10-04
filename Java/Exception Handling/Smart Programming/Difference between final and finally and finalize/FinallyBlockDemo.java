package com.ExceptionHandling;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		try {
			int a = 100;
			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block");
		}
	}

}

//output :
//100
//I am in finally block