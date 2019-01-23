/**program to remove an index from the array
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
public class RemoveAnIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9};
		int removeindex=4;
		System.out.println("The original array is: "+Arrays.toString(array));
		for(int num=removeindex;num<array.length-1;num++) {
			array[num]=array[num+1];
		}
		System.out.println("The new array is:" +Arrays.toString(array));

	}

}
