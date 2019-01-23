/**program to print the sorted array using quick sort
 * 
 */
package com.prismitcorp.assignments.array;

/**
 * @author cheku
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	//taking  methos named quickSort and initiated variables array,start,end
	public static void quickSort(int[] array, int start, int end) {
		//provided the array start and end index
		//quickSort(array,start,end);
		//if start less than end move the elements in array to left side of pivot
		int pindex=partition(array,start,end);
		if(start<end) {
			
			//sorting towards the left side
			quickSort(array,start,pindex-1);
		}
		if(start>end) {
			//sorting towards right side
			quickSort(array,pindex+1,end);
		}
		}
	private static int partition(int[] array, int start, int end) {
		
		int pivot=array[end];
		int pindex=array[start];
		int temp=0;
		for(int value=start;value<end;value++) {
			if(array[value]<array[pivot]) {
				swap(array[value],array[pindex]);
				pindex++;
				
			}
		}
		swap(array[pivot],array[end]);
		return pindex;
	}
	private static void swap(int i, int j) {
		
	}
	public static void main(String[] args) {
		int[] array= {20,4,15,53,44,18,10,26,3,2};
		quickSort(array,0,10);
		for(int digit=0;digit<10;digit++);

	}

}
