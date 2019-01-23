/**
 * 
 */
package com.prismit.basic.exception;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class NullException {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try {
        	String str=null;
        	System.out.println(str.charAt(0));
        }catch(NullPointerException n) {
        	System.out.println("The given String is null. It is a null point exception");
        }
		
		 
		

	}

}
