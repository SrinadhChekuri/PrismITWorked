/**
program to remove the element in the array
 * 
 */
package com.prismit.basic.jan18;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class DeletingElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5,6};
		int find=5;
		boolean flag=false;
		for(int value=0;value<array.length;value++) {
			if(array[value]==find) {
				System.out.println("The value is in the array "+array[value]);
			}
	}
		//System.out.println("The value is not in the array ");
   
}
}
