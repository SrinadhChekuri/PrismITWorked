package com.prismit.training;
import java.util.Scanner;

public class quotiatnt {
	public static void main(String[] args) {
		
		Double dividend, divisor, quotient, remainder;
		
		Scanner math= new Scanner(System.in);
		
	System.out.println("Enter the value of dividend: ");
	dividend= math.nextDouble();
	
	System.out.println("Enter the value of divisor: ");
	divisor= math.nextDouble();
	
	quotient= dividend / divisor;
	remainder= dividend % divisor;
	
	System.out.println("The value of quotient is: " +quotient);
	System.out.println("The value of remainder is: " +remainder);
		
		
	}

}
