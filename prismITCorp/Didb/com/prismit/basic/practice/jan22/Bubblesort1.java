/**
program to sort the array using bubble sort
 * 
 */
package com.prismit.basic.practice.jan22;

/**
 * @author cheku
 *
 */
public class Bubblesort1 {

	/**
	 * @param args 
	 * declare temp
	 * create for loop to check the length
	 * create for loop to select the index elements inside array
	 * if satement to comppare the array elements
	 * swap the elements 
	 * 
	 */
	public static void bubbleSort(int[] array){
		int length=array.length;
		int temp=0;
		for(int i=0;i<(length);i++) {
			for(int j=1;j<((length)-i);j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
					
		
					 
				}
			}
		}
		
	}
	//for loop to copy the array in to a variable
	public static void main(String[] args) {
		//declaring the array
		int []array= {10,30,2,47,21,1};
		bubbleSort(array);
		for(int element:array) {
			System.out.println(element);
		}

	}

}
