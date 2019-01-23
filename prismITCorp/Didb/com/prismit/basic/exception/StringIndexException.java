/**
 * 
 */
package com.prismit.basic.exception;

/**
 * @author  planet
 *
 */
public class StringIndexException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String str="hello world";
			System.out.println(str.charAt(25));
		}catch(StringIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("exceeds limit");
		}
		

	}

}
