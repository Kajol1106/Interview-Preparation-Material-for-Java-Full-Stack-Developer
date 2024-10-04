package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryAndCatchDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Check after try catch block statement are working or not");
	}

}
