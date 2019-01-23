/**program to sort the string array
 * 
 */
package com.prismit.basic.jan16;

import java.util.Arrays;

/**
 * @author  planet
 *
 */
public class SortStringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"car","luck","air","jay","drunk","google","gang"};
		System.out.println("The original array is: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("The sorted array is: "+Arrays.deepToString(a));

	}

}
