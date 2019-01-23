package com.prismit.training;
import java.util.Scanner;

public class swap {
public static void main(String[] args) {
	
	double firstnumber,secondnumber,temp;
	
	Scanner number=new Scanner(System.in);
	System.out.println("Enter the first number: ");
	firstnumber= number.nextDouble();
	
	System.out.println("Enter the second number: ");
	secondnumber= number.nextDouble();
	
	temp=firstnumber;
	
	firstnumber= secondnumber;
	
	secondnumber= temp;
	
	System.out.println("The first number is: " +firstnumber);
	System.out.println("The second number is: " +secondnumber);
	
	
	
	
	
	
}
}
