package com.ExceptionHandling;

public class Voting {

	public static void main(String[] args) {
		int age = 19;
		if(age < 18) {
			throw new YoungerAgeException("You are not eligible for voting");
		}
		else {
			System.out.println("You can vote successfully");
		}
	}

}
