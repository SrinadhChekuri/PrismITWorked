/**
 * 
 */
package com.prismit.basic.exception;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class IndexException {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//declaring the array
			int [] array=new int[5];
			//providing the value to the array index 10
			array[10]=9;
			System.out.println(array[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//printing the exception type
			System.out.println("Index out of bound exception");
		}
	}

}
