package com.ExceptionHandling;



public class RuntimeException {

	public static void main(String[] args) {
		int a = 100, b = 0, c;
		c = a/b;
		System.out.println(c);
	}
}

//In this program compile cab't check the exception and can compile the program successfully and 
// will show an Arithmetic Exception.
