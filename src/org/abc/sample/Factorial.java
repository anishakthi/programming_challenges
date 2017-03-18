package org.abc.sample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		int fact = factorial(num);
		System.out.println("Factorial of number " + num + " is " + fact);
		scanner.close();
	}

	private static int factorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
