package com.cognixia.jump.corejava;

public class Conditionals {

	public static void main(String[] args) {
		
		// If statement (stand alone)
		System.out.println("If example: ");
		
		int checkInt = 50;
		
		if(checkInt % 10 == 0) {
			System.out.println("Divisible by 10!");
		}

		// If - else, and else - if
		System.out.println("If - else and else if: ");
		
		if(checkInt % 10 == 0) {
			System.out.println("Divisible by 10!");
		} else if (checkInt % 5 ==0){
			System.out.println("Divisible by 5!");
		} else {
			System.out.println("No match.");
		}
		
		// Logical Condition Operators
		System.out.println("If conditional: ");
		
		checkInt = -45;
		
		if(checkInt > 0 && checkInt % 5 == 0) {
			System.out.println("Positive number divisible by 5!");
		} else {
			System.out.println("No match.");
		}
		
		// Switch Statement (ATM Example)
		System.out.println("If switch ATM example: ");
		System.out.println("Please choose from: \n" + "Options below");
		switch(checkInt) {
		case 1:
			System.out.println("Check balance");
			
		case 2:
			System.out.println("Deposit");
			
		case 3:
			System.out.println("Withdraw");
			
		case 4:
			System.out.println("Exit");
			
		default:
			System.out.println("Exiting");
		}
		
		
	}

}
