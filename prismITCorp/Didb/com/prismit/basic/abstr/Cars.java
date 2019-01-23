/**
 * 
 */
package com.prismit.basic.abstr;

/**
 * @author cheku
 *
 */
public abstract class Cars {
	
	 public abstract int add(int first, int second);
	public abstract int sub(int first, int second);
	
	public int mul(int first, int second) {
		System.out.println("This is impleted for everyone");
		return (first*second);
	}
	

}
