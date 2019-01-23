/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class SumOfNaturalNumbersDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=100,sum=0,value=1;
		do {
			sum=sum+value;
			value++;
		}while(value<=num);
		System.out.println(sum);

	}

}
