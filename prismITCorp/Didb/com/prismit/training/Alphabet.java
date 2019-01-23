package com.prismit.training;
import java.util.Scanner;

public class Alphabet {
	public static void main(String [] args) {
		char c;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a character: ");
		c=scanner.next().charAt(0);
		if ((c>='a') && (c<='z')) {
		System.out.println("You entered an Alphabet: " +c);
		} else if ((c>='A') && (c<='Z')){
			System.out.println("You entered an Alphabet: " +c);
		} else {
			System.out.println("You entered characted is not an Alphabet: " +c);
		}
	}

}
