/**program to print the array length
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 */
public class ArrayLength {

	/**
	 * @param args
	 */
	public static void printArray(int[] array) {
		if(array==null) {
			//if we didn't specify the array elements then it will print n ull
			System.out.println("There is no length for this array as it is a null");
		}else {
			//allocating the array length
			int arrayLength=array.length;
			System.out.println("The length of array is: "+arrayLength);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the arrays
		int [] array1= {1,2,3,4};
		int [] array2= {1,2,3,5,7};
		int [] array3= {1,4,6,2};
		printArray(array1);
		printArray(array2);
		printArray(array3);

	}

}
