/**program to find the sum of given number
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class SumOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,add,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		
		for(int check=num;check>=num;check++) {
			
			add=num%10;
			sum=sum+add;
			num=num/10;
		}
		
			System.out.println("The sum of the number: "+sum);
		
	}

}
