/**program to find the prime number using while loop
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2;
		boolean flag=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		int itiration = 1 ;
		while(i<=num/2) {
			itiration = itiration + 1 ;
			if(num%i==0) {
				flag=true;
				break;
			}
			i++;
			if(itiration == 1000) {
				break;
			}
		}
		if(!flag) {
			System.out.println("The given number is prime number"+num);
		}else {
			System.out.println("the given number is not a prime numer: "+num)
;		}

	}

}
