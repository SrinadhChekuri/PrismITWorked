/**
 * 
 */
package com.prismit.arraylist.srinadh;

import java.util.Arrays;

/**
 * @author cheku
 *
 */
public class InsertingValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaring the array
		int []array=new int[10];
		//inserting the elements to array
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		array[5]=6;
		array[6]=7;
		array[7]=8;
		array[8]=9;
		array[9]=10;
		double sum=0;
		try {
			//for loop to get the elements in array index  
			for(int value=0;value<array.length;value++) {
				sum=sum+array[value];
			}
			//printing the sum of array 
			System.out.println("the sum of array is: "+sum);
		}catch(ArrayIndexOutOfBoundsException e) {
			//printing the exceding the message 
			System.out.println("Exceeds the length of array");
		}
		//int index=0;
		int[] array1=new int[array.length+1];
		//index=array.length+1;
		int element=11;
		try {
			for(int value=0;value<array.length;value++) {
				array1[value]=array[value];
				
			}
			array1[array1.length-1]=element;
			System.out.println(Arrays.toString(array1));
		}catch(Exception e) {
				e.printStackTrace();
				System.out.println("exceeds the limit");
			}
	}
}


