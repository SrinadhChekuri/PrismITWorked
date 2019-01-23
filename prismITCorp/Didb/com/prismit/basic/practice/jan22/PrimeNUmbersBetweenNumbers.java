/**prime numbers between numbers
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 * version 1.8.0 2018-12
 *
 */
public class PrimeNUmbersBetweenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int minnum, maxnum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the minnum number: ");
		minnum=scanner.nextInt();
		System.out.println("Enter the maxnum number: ");
		maxnum=scanner.nextInt();
		for(int value=minnum;value<=maxnum;value++) {
			int count=0;
			for(int digit=2;digit<=value/2;digit++) {
				if(value%digit==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(value);
			}
			}
		}
}
		



