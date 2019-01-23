/**program to sort the array using bubble sort with integer
 * 
 */
package com.prismit.basic.jan18;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class BubbleSortWithInt {

	/**
	 * @param args
	 */
	public static void bubbleSort(int[] array) {
		//assigning the length of the array to the varible length
		int length=array.length;
		int temp=0;
		for(int value=0;value<length;value++) {
			for(int digit=1;digit<(length-value);digit++) {
				if(array[digit-1]>array[digit]) {
					temp=array[digit-1];
					array[digit-1]=array[digit];
					array[digit]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the array
		int [] array= {47,24,20,60,18,4,3};
		bubbleSort(array);
		//copying the array to the element
		for (int element:array) {
			//printing the sorted array 
			System.out.println(element);
		}

	}

}
