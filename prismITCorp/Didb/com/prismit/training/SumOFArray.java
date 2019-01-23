/**program to find the sum of arrays
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class SumOFArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5};
		double sum=0;
		for(int num=0;num<array.length;num++) {
			sum=sum+array[num];
		}
		System.out.println("the sum of the array is: "+sum);

	}

}
