/**program to print the intersection of two arrays
 * 
 */
package com.prismitcorp.assignments.array;
import java.util.Scanner;
import java.lang.*;

/**
 * @author cheku
 *
 */
public class IntersectionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array1= {2,14,2,5,4};
		int [] array2= {5,3,23,14};
		int [] array3 = new int[5];
		int value=0;
		boolean flag=false;
		for(int index=0;index<array1.length;index++) {
			for(int index2=0;index2<array2.length;index2++) {
				if(array1[index]==array2[index2]) {
				     // for(int value=0;value<value+1;value++) {
					array3[value]=array1[index];
				     // }
				      flag=true;
				}
			}	
		}
	
		if(flag==true) {
			System.out.println(array3);
		}else {
			System.out.println("null set");
		}

	}

}
