/**program to find the average of the array
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class AverageOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		double average=0,sum=0;
		for(int num=0;num<array.length;num++) {
			sum=sum+array[num];
		}
		average=sum/array.length;
		System.out.println("the average fo the array is: "+average);

	}

}
