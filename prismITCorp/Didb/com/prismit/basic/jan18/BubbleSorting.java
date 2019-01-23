/**
program to sort the array using bubble sort
 * 
 */
package com.prismit.basic.jan18;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class BubbleSorting {

	/**
	 * @param args
	 */
	public static void bubbleSort(char[] array) {
		char temp=0;
		//assigning the length of the array to the variable length
		int length=array.length;
		for(int check=0;check<length;check++) {
			for(int value=1;value<(length-check);value++) {
				//checking which element in array is bigger
				if(array[value-1]>array[value]) {
					//transfering the bigger value to temp
					temp=array[value-1];
					//transfering the smaller value to the array[value-1]
					array[value-1]=array[value];
					//Transfering the value in the temp to the array[value]
					array[value]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the array
		char[] array= {'g','a','r','f','q'};
		bubbleSort(array);
		//copying the array to the element
		for(char element:array) {
			//printing the element in the console
			System.out.println(element);
		}
		

	}

}
