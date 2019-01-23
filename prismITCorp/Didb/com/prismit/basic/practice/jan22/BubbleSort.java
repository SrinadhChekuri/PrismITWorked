/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void bubbleSort(int [] array) {
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
		int [] array= {20,3,31,13,24,10,2};
		bubbleSort(array);
		for(int element:array) {
			System.out.print(element+" ");
		}

	}

}
