/**
 * 
 */
package com.prismit.sorting.srinadh;

/**
 * @author cheku
 *
 */
public class QuickSortImpel implements quickSort {

	/**
	 * 
	 */
	public QuickSortImpel() {
	}

	/* (non-Javadoc)
	 * @see com.prismit.sorting.srinadh.quickSort#quickSort(int[], int, int)
	 */
	@Override
	public void quickSort(int[] array, int start, int end) {
		int partition=partition(array,start,end);
		if(partition-1>start) {
			quickSort(array,start,partition-1);
		}
		if(partition+1<end) {
			quickSort(array,partition+1,end);
		}

	}

	/* (non-Javadoc)
	 * @see com.prismit.sorting.srinadh.quickSort#partition(int[], int, int)
	 */
	@Override
	public int partition(int[] array, int start, int end) {
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

}
