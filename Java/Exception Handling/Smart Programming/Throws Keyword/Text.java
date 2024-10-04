package com.ExceptionHandling;

import java.io.FileNotFoundException;

public class Text {

	public static void main(String[] args) {
		ReadWrite rw = new ReadWrite();
		try {
			rw.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			rw.saveFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Is exeption handling working or not ");
	}

}
