package com.cognixia.jump.corejava;

public class coreyHelp {

	public static void main(String[] args) {

		// while loop
		System.out.println("While Loop:");

		int count = 0;
		boolean condition = true;
		while (true) {

			if (count % 2 != 0) {
				System.out.println(count);
			}
			
			count++;
			if (count % 25 == 0) {
				break;
			}
		}

		// Do - while
		System.out.println(" \n Do while in the loop");

		int count1 = 11;

		do {
			System.out.println("in the loop");
			count1++;

		} while (count1 < 10);

		// for loop
		System.out.println("\nFor loop");

		for (int i = 0; i < 10; i++) {
			int x = 1;
			x += 1;
			x = x + 1;
			System.out.println(i);
		}

		// nested loop
		System.out.println("\nNested Loops");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + "" + j);
			}
		}
	}

}
