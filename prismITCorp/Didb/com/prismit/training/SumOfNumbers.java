/**
program to find sum of N numbers
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * Version 1.8.0 2018-12
 *
 */
public class SumOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5, result=0,value;
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for (value=0;value<5;value++) {
			result=result+a[value];
		}
		System.out.println("the sum of number is:" +result);
		

	}

}
