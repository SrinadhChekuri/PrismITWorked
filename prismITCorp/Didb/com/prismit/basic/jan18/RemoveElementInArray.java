/**program to remove the element in the array
 * 
 */
package com.prismit.basic.jan18;
//import java.util.*;
import java.util.Arrays;
/**
 * @author  planet
 *
 */
public class RemoveElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};           ,
		int length=array1.length;
		int delete=4;
		for(int value=0;value<length;value++) {
			if(array1[value]==delete) {		
				array1 = ArrayUtils.removeElement(array1, value);
				System.out.println("The new array is: "+array1);
				}
			}
		}

		

	}


