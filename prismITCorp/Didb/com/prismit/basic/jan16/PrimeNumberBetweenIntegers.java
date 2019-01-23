/**program to find the integers between two integers
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class PrimeNumberBetweenIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first numer:");
		first=scanner.nextInt();
		System.out.println("Enter the second number:");
		second=scanner.nextInt();
		while(first<second) {
			boolean flag=false;
			for(int check=2;check<=first/2;check++) {
				if(first%check==0) {
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println("The prime numbers are :" +first);
			first++;
		}
		

	}

}
