/**program to catch the exception if occured and execute the program
 * 
 */
package com.prismit.basic.exception;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initiating hte variables
		int firstNumber;
		int secondNumber;
		int div;
		Scanner scanner=new Scanner(System.in);
		// asking to enter the firstNUmber value
		System.out.println("Enther the firstNumber value: ");
		//storing the value in the firstNumber
		firstNumber=scanner.nextInt();
		// asking to enter the secondNUmber value
		System.out.println("Enter the secondNumber value: ");
		//storing the value in the secondNumber
		secondNumber=scanner.nextInt();
		try {
		div=(firstNumber/secondNumber);
		System.out.println("The div is: "+div);
		}catch(ArithmeticException e) {
			//printing the type of exception
			System.out.println("never divide with zero");
		}
		
	}

}
