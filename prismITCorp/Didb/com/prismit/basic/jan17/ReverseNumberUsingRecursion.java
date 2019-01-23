/**program to reverse the number using recursion
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.00 2018-12
 *
 */
public class ReverseNumberUsingRecursion {

	/**
	 * @param args
	 */
	public static void reverseMethod(int number) {
        //if statement whether the number is less than 10 or not 
		if(number<0) {
			//if number is less than 10 then print same number
			System.out.println("the reverse number is: "+number);
			return;
		}else {
			System.out.print(number%10);
			reverseMethod(number/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scanner.nextInt();
		System.out.print("the reverse of the number is: ");
		reverseMethod(number);
		System.out.println();
	}

}
