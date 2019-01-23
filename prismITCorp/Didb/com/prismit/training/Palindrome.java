/**
Program to check whether given number is Palindrome or not
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,originalnumber,reversednumber=0,remainder;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		originalnumber=num;
		while(num!=0) {
			remainder=num%10;
			reversednumber=reversednumber*10 + remainder;
			num=num/10;
		}
		if(originalnumber==reversednumber) {
			System.out.println("The given number is palindrom: " +originalnumber);
		}else {
			System.out.println("The given number is not palindrome: " +originalnumber);
		}

	}

}
