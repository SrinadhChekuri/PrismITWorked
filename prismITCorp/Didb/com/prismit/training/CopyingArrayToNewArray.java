/**
program to copy an array to new array
 * 
 */
package com.prismit.training;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class CopyingArrayToNewArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9};
		int array2[]=new int[9];
		System.out.println("The original array: "+Arrays.toString(array));
		for(int num=0;num<array.length;num++) {
			array2[num]=array[num];
		}
		System.out.println("The second array is:"+Arrays.toString(array2));

	}

}
