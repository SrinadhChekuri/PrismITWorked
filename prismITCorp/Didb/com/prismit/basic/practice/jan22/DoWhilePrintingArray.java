/**
 * 
 */
package com.prismit.basic.practice.jan22;

/**
 * @author cheku
 *
 */
public class DoWhilePrintingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		int index=0;
		do {
			System.out.println(array[index]);
			index++;
		}while(index<=4);

	}

}
