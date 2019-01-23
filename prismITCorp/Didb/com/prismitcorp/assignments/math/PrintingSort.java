/**program to print the sorted array
 * 
 */
package com.prismitcorp.assignments.math;

/**
 * @author cheku
 *
 */
public class PrintingSort {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		Sort result=new ImplemetSort();
		int[] array= {10,3,5,8,2};	
		result.bubbleSort(array);
		//bubbleSort(array);
		for(int element:array) {
			System.out.print(element+" ");
		}	
			
			result.linearSearch(array);
	}

}
