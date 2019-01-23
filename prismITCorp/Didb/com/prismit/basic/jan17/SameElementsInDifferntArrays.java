/**
program to find the same elements in differnet of arrays
 * 
 */
package com.prismit.basic.jan17;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class SameElementsInDifferntArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {2,5,7,4};
		int array2[]= {9,7,2,3};
		for(int value=0;value<array1.length;value++) {
			for(int digit=0;digit<array2.length;digit++) {
				//checking the first array with another array
				if(array1[value]==array2[digit]) {
					System.out.println("The same numbers are: "+array1[value]);
				}
			}
		}

	}

}
