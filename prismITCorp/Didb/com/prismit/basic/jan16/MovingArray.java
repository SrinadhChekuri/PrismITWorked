/**
program to move one array to differsnt array
 * 
 */
package com.prismit.basic.jan16;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  planet
 *
 */
public class MovingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int a2[]=new int[5];
		System.out.println("The first array is: "+Arrays.toString(a));
		for(int initial=0;initial<a.length;initial++) {
			a2[initial]=a[initial];
		}
		System.out.println("The second array is:"+Arrays.toString(a2));
	}

	}


