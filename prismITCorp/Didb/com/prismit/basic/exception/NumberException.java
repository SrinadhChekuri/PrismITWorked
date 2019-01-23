/**
 * 
 */
package com.prismit.basic.exception;

/**
 * @author chellphone planet
 *
 */
public class NumberException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//declaring the sting 
		String string="123";
		//converting the string value to integer
		int value=Integer.parseInt(string);
		//printing the value
		System.out.println(value);
		}catch(NumberFormatException e) {
			//if the exception occurs while converting string into integer, it will print below statement
			System.out.println("NUmber format exception");
		}
		

	}

}
