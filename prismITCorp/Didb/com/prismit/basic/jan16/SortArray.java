/**program to sort the array
 * 
 */
package com.prismit.basic.jan16;

import java.util.Arrays;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {23,43,1,46,25,7,35,75,57,456,35,32,35,2};
		System.out.println("The original array is: "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("The sorted the array is:" +Arrays.toString(array));

	}

}
