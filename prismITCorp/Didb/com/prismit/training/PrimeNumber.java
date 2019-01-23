/**
Program to find whether the given number is prime or not
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * class description goes here.
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isprime=true;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value: ");
		/*capture the input to integer*/
		int num=scanner.nextInt();
		scanner.close();
		for(int i=2;i<=num/2 ;i++) {
			temp=num%i;
			if(temp==0) {
				isprime=false;
				break;
			}}
			if(isprime==true) {
				System.out.println("The entered number is prime " +num);
			} else {
				System.out.println("The entered number is not prime " +num);
									
		}
	}

}
