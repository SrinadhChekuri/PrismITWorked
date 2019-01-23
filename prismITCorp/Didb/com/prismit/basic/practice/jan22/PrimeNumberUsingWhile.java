/**program to find the prime number using loop
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class PrimeNumberUsingWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		boolean flag=false;
		int value=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		while(value<=num/2) {
			if(num%value==0) {
				flag=true;
				break;
			}
			value++;
		}
		if(flag==false) {
			System.out.println("Is prime: ");
		}else {
			System.out.println("not prime: ");
		}
		
		

	}

}
