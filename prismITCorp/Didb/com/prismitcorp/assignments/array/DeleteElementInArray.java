/**program to delete an element in array
 * 
 */
package com.prismitcorp.assignments.array;

/**
 * @author cheku
 *
 */
public class DeleteElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array= {30,3,26,3,46,26};
		int delete=46;
		for(int value=0;value<array.length;value++) {
			if(array[value]==delete) {
				for(int digit=value;digit<array.length-1;digit++) {
					array[value]=array[value+1];
				}
				//System.out.println(+Arrays.toString(array));
			}
		}
		for(int i=0;i<array.length-1;i++) {
			System.out.println(array[i]);
		}

	}

}
