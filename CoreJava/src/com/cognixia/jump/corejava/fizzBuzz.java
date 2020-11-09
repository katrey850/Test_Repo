package com.cognixia.jump.corejava;

import java.util.Scanner;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input an integer: ");
		Scanner input = new Scanner(System.in);
		
		int userInput = input.nextInt();
		
		if (userInput > 0) {
			if (userInput % 5 == 0 && userInput % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (userInput % 3 == 0) {
				System.out.println("Buzz");
			} else if (userInput % 5 == 0) {
				System.out.println("Fizz");
			} else {		}
		} else if (userInput % 2 == 0 && userInput < 0) {
			System.out.println("Even negative");
		} else {		}
		
		input.close();
	}

}











