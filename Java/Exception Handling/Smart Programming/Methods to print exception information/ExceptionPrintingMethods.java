package com.ExceptionHandling;

public class ExceptionPrintingMethods {

	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			//It will print exception name, description and stack trace
			e.printStackTrace();
			System.out.println();
			
			//It will print only exception and description
			System.out.println(e.toString());
			System.out.println();
			
			//It will print only descritpion
			System.out.println(e.getMessage());
		}
	}

}
