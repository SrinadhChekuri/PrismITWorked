/**program to sort Numberic array and String array
 * 
 */
package com.prismit.training;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class SortingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {123,746,84,3,79,0,475,53,895,93,864,273};
		String array2[]= {"balu","sai","ajay","jagar","eye","map","suffle","sherat"};
		System.out.println("the original array numbers are: "+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("The sortes array numbers are: "+Arrays.toString(array1));
		System.out.println("The original string array is: "+Arrays.deepToString(array2));
		Arrays.sort(array2);
		System.out.println("The sorted String array is: "+Arrays.deepToString(array2));

	}

}
