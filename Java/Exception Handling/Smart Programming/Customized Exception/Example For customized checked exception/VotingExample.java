package com.ExceptionHandling;

public class VotingExample {

	public static void main(String[] args) {
		try {
			int age = 19;
			if(age < 18) {
				throw new YoungerAgeException("You are not eligible for voting");
			}
			else {
				System.out.println("You can vote successfully");
			}
		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
	}

}
