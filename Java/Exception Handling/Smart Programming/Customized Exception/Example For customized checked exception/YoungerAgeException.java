package com.ExceptionHandling;

public class YoungerAgeException extends Exception {

	public YoungerAgeException(String msg) {
		super(msg);
	}
	
	public YoungerAgeException() {
		super("You are under age");
	}
	
}
