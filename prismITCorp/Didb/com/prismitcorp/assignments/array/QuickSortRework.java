/**program to sort the array using quick sort
 * 
 */
package com.prismitcorp.assignments.array;
import java.util.Arrays;


/**
 * @author cheku
 *
 */
public class QuickSortRework {

	/**
	 * @param args
	 */
	public static void quickSort(int[] array, int start, int end) {
		int partition=partition(array, start, end);
		System.out.println("partition:"+partition);
		if(partition-1>start) {
			quickSort(array,start,partition-1);
		}
		if(partition+1<end) {
			quickSort(array,partition+1,end);
		}
		
	}
	private static int partition(int[] array, int start, int end) {
		int pivot=array[end];
		for(int value=start;value<end;value++) {
			if(array[value]<pivot) {
				int temp=array[start];
				array[start]=array[value];
				array[value]=temp;
				start++;
			}
		}
		int temp=array[start];
		array[start]=pivot;
		array[end]=temp;
		return start;
	}
	public static void main(String[] args) {
		int[] array= {29,4,20,6,4,60,14,34};
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));

	}

}
