package com.prismit.training;
import java.util.Scanner;

public class Addingintegers {
	private static Scanner add;

	public static void main(String [] args) {
		
		int first,second,sum;
	
	add = new Scanner(System.in);
	
	
	System.out.println("Enter first value: ");
	 
	first=add.nextInt();
	
	System.out.println("Enter second Value: ");
	
	second=add.nextInt();
	
	sum= first+second;
	
	System.out.println("The sum of two integers: "+sum);
	
	
	
	
	}

}
