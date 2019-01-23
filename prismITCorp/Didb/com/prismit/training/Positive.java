package com.prismit.training;
import java.util.Scanner;
public class Positive {
	public static void main(String [] args) {		
		int number;
		Scanner value=new Scanner(System.in);		
	System.out.println("Enter the number");
	number=value.nextInt();
	if (number > 0) {
		System.out.println("The number is positive: " +number);
	} else if (number== 0) {
		System.out.println("You entered 0:" +number);
	}else {
		System.out.println("The number is negative: " +number);
	}
	
		
	}
}
