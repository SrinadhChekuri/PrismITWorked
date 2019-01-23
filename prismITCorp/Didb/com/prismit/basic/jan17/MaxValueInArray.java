/**
program to find the maximum value in the array
 * 
 */
package com.prismit.basic.jan17;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class MaxValueInArray {

	/**
	 * @param args
	 */
	public static int maxValue(int[] array) {
		//assigning array[0] value to maxValue
		int maxValue=array[0];
		for(int value=1;value<=array.length-1;value++) {
			//assigning array[values] to the num
			int num=array[value];
			//checking whether num is greater than maxValue
			if(num>maxValue) {
				//if num is greater than maxValue then assigning that value to maxValue.
				maxValue=num;
			}
		}
		return maxValue;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,40,50,90,2,40,60,3,80};
		//printing the maximum value in the array in the console
		System.out.println("The maximum value is: "+maxValue(array));
		maxValue(array);

	}

}
