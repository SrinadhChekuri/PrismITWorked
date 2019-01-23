/**program to print the numtidimentioanl array 
 * 
 */
package com.prismit.basic.jan17;

import java.util.Arrays;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class PrintMultidimentionalArray {

	/**
	 * @param args
	 */
	public static void printArray(int[][] array) {
		System.out.println(Arrays.deepToString(array));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array= {{1,2,3,4},{5,6,7,8}};
		printArray(array);

	}

}
