package com.ExceptionHandling;

public class YoungerAgeException extends RunTimeException {

	public YoungerAgeException(String msg) {
		super(msg);
	}
	
	public YoungerAgeException() {
		super("You are under age");
	}
	
}
