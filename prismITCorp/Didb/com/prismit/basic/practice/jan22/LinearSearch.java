package com.prismit.basic.practice.jan22;

public class LinearSearch {
	public static int linearSearch(int[] array, int tofind) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==tofind) {
				return i;
				
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int [] array= {1,2,3,4,5};
		int tofind=10;
		int result=linearSearch(array,tofind);
		if(result==0) {
			System.out.println("not in array: ");
		}else {
			System.out.println("the element is present in array: "+result);
		}

	}

}
