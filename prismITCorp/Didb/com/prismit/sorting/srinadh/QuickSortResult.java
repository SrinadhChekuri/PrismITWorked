/**
 * 
 */
package com.prismit.sorting.srinadh;

import java.util.Arrays;

/**
 * @author cheku
 *
 */
public class QuickSortResult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array= {10,4,20,12,46,6};
		quickSort sort=new QuickSortImpel();
		sort.quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
