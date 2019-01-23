/**implementing the methods declared in Sort
 * 
 */
package com.prismitcorp.assignments.math;

/**
 * @author cheku
 * version 1.8.0 2018-12
 *
 */
public class ImplemetSort implements Sort {

	/**
	 * 
	 */
	public ImplemetSort() {
	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.Sort#bubbleSort(int[])
	 * declare variable temp
	 * assign the array length to a variable
	 * create for loop to run the sorting process
	 * create another for loop to assign the elements of array
	 * if statement to compare the elements of array
	 * swap the array elements
	 */
	@Override
	public void bubbleSort(int[] array) throws Exception {
		//declare variable temp
		int temp=0;
		//assign the array length to a variable
		int length=array.length;
		try {
			// for loop to run the sorting process
			for(int index=0;index<length;index++) {
				//another for loop to assign the elements of array
				for(int value=1;value<(length-index);value++) {
					//if statement to compare the elements of array
					if(array[value-1]>array[value]) {
						//swap the array elements
						temp=array[value-1];
						array[value-1]=array[value];
						array[value]=temp;
					}
					}
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Logic exceeds the array length.");
		}
		
	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.Sort#linearSearch(int[])
	 */
	@Override
	public void linearSearch(int[] array) throws Exception {
		//assign the array length to a variable
		int length=array.length;
		//assigning the variable to find in the array
		int tofind=29;
		boolean flag=false;
		try {
			//for loop to find get the elements in array from 0th position
		for(int index=0;index<length;index++) {
			//checking whether the array index value is same as tofind element
			if(array[index]==tofind) {
				flag=true;
				break;
			}
		}
		// println statement to keep the curser in new line at console
		System.out.println();
		if(flag==false) {
				//printing the output in console
				System.out.println("the element is not present in the array"+tofind);	
			}else {
				//printing the output in console
				System.out.println("The element is present in the array"+tofind);
			
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("An error occured");
		}
		

	}

}
