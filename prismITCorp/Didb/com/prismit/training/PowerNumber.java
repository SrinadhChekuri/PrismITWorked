/**
Program to find the power of a number using while loop 
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 * 
 * class description goes here
 *
 */
public class PowerNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exponent;
		long result=1;
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter the base value: ");   /* giving the base value*/
		base= scanner1.nextInt();                       /* reading the value to base*/
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter the exponent: ");      /*giving the exponent value*/
		exponent= scanner2.nextInt();                    /*reading the value to exponent*/
		/* while loop started here*/
		while(exponent!=0) {
			result=result*base;
			--exponent;
		}
		System.out.println("The result is: " +result);

	}

}
