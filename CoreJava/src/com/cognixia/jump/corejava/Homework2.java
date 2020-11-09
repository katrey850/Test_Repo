package com.cognixia.jump.corejava;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Input an integer"); Scanner input = new
		 * Scanner(System.in);
		 * 
		 * final int n = input.nextInt();
		 * 
		 * int i, k; int flag;
		 * 
		 * for (i = 1; i <= n; i++) {
		 * 
		 * flag = 0;
		 * 
		 * if (i % 5 == 0 && i % 3 == 0) { System.out.println("Fizzbuzz"); } else if (i
		 * % 5 == 0) { System.out.println("Buzz"); } else if (i % 3 == 0) {
		 * System.out.println("Fizz"); } else if (i == 1) { System.out.println(" "); }
		 * else {
		 * 
		 * int m = i/2;
		 * 
		 * for (k = 2; k <= m; k++) { if (i % k == 0) { System.out.println(i); flag = 1;
		 * break; } } if (flag == 0) { System.out.println(" "); } } // end of else }
		 */

		System.out.println("\nDo while in the loop");

		int count1 = 11;

		do {
			System.out.println("in the loop");
			count1++;

		} while (count1 < 10);

	}
}
