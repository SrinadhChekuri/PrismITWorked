/**
 * program to find the mininum value in an array
 */
package com.prismit.basic.jan17;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class MinValurInArray {

	/**
	 * @param args
	 * @return 
	 */
	public static int minValue(int [] array) {
		//assigning array[0] value to minValue
		int minValue= array[0];
		for(int value=1;value<=array.length-1;value++) {
			int num=array[value];
			//checking whether the value is smaller value than minValue
			if(num<minValue) {
				//if num is small value than minValue then assigning the num value to minValue
				minValue=num;
			}
		}
		return minValue;
	}
	public static void main(String[] args) {
		int [] array= {30,20,40,8,64,18,9};
		System.out.println("The min value is: "+minValue(array) );
		minValue(array);
	}

}
