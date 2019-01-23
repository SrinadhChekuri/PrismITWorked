/**
program to combine two arrays into single array
 * 
 */
package com.prismit.basic.jan18;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  planet
 *version 1.8.0 2018-12
 */
public class CombineTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the arrays
		int[] array1= {2,3,4};
		int[] array2= {5,6,7};
		//findng the lenght of array1 and array2 and assigning it to the length
		int length=array1.length+array2.length;
		//allocating the array length
		int[] array3=new int[length];
		int index=0;
		//enhanced for loop
		for(int element:array1) {
			//moving the values in the element to the array3 depending on index value
			array3[index]=element;
			index++;
		}
		for(int element:array2) {
			array3[index]=element;
			index++;
		}
		//printing the array3
		System.out.println(Arrays.toString(array3));

	}

}
