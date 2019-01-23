/**program to find the prime number using for loop
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 * version 1.8.0 2018-12
 *
 */
public class PrimeNumberWithForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int temp;
		boolean flag=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enther the number");
		num=scanner.nextInt();
		for(int value=2;value<=num/2;value++) {
			temp=num%value;
			if(temp==0) {
				flag=true;
				break;
			}}
			if(flag==false) {
				System.out.println("Is prime number: ");
			}else {
				System.out.println("Not a prime number: ");
			}
	}

}
