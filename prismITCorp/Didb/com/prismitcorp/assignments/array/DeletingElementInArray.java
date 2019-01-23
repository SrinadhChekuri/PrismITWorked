/**program to delete an element in an array
 * 
 */
package com.prismitcorp.assignments.array;

/**
 * @author cheku version 1.8.0 2018-12
 */
public class DeletingElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70 };
		int delete = 50;
		int length = array.length;
		for (int index = 0; index < length; index++) {
			if (array[index] == delete) {
				for (int index1 = index; index1 <length-1 ; index1++) {
					array[index1] = array[index1 + 1];
				}
			}
		}
		for (int elemnt = 0; elemnt < length - 1; elemnt++) {
			System.out.println(array[elemnt]);
		}

	}

}
