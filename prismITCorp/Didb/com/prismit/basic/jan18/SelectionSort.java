/**program to sort the elements in the array using selection sort
 * 
 */
package com.prismit.basic.jan18;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void selectionSort(int[] array) {
		int length=array.length;
		int temp=0;
		for(int value=0;value<(length-1);value++) {
			for(int digit=value+1;digit<length;digit++) {
				if(array[digit]<array[value]) {
					temp=array[digit];
					array[digit]=array[value];
					array[value]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {14,2,10,13,5};
		selectionSort(array);
		for(int element:array) {
			System.out.println(element);
		}

	}

}
