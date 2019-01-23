/**
 * Program to find the factorial of a number
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, check, fact=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=scanner.nextInt();
		for(check=1; check<=num; check++) {
			fact=fact*check;
		} 
		System.out.println("The factorial of the given number is: "+fact);

	}

}
