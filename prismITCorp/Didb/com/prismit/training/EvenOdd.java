package com.prismit.training;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		if ((number % 2) == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
}
