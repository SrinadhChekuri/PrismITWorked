/**program to find the sum of N natural numbers
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 * versin 1.8.0 2018-12
 *
 */
public class SumOfNaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaring the variables
		int num,sum=0;
		Scanner scanner=new Scanner(System.in);
		//asking to enter the number
		System.out.println("Enther the number ");
		//storing the entered value to num.
		num=scanner.nextInt();
		//using for loop to increment value upto num
		for(int value=1;value<=num;value++) {
			//adding the N natural numbers and storing in a varibale calle sum.
			sum=sum+value;
		}
		//printing the sum of N natural numbers
		System.out.println("The sumof the naturak numbers is: "+sum);
		

	}

}
