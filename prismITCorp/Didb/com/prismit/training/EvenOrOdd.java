/**program to find the given number is even or odd
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		if(num==0) {
			System.out.println("You given: "+num);
		}else if(num%2==0) {
			System.out.println("The given number is even: "+num);
		}else {
			System.out.println("The given number is odd: "+num);
		}

	}

}
