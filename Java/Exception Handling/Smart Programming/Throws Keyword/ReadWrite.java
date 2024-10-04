package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWrite extends RuntimeException{
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
	}
	
	void saveFile() throws FileNotFoundException {
		String text = "This is demo";
		FileOutputStream fos = new FileOutputStream("xyz.txt");
	}
}
