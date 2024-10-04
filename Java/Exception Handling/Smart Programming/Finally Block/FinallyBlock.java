package com.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block");
		}
	}

}

//output :
//java.lang.ArithmeticException: / by zero
//at com.ExceptionHandling.FinallyBlock.main(FinallyBlock.java:7)
//I am in finally block