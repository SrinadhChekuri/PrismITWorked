/**
 * 
 */
package com.prismitbasic.Interface;

/**
 * @author cheku
 *
 */
public class Mathsub4 implements Math, Math2 {

	/**
	 * 
	 */
	public Mathsub4() {
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.Interface.Math2#div(int, int)
	 */
	@Override
	public int div(int first, int second) {
		System.out.println("This is the subclass 4");
		return (first/second);
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.Interface.Math#add(int, int)
	 */
	@Override
	public int add(int first, int second) {
		System.out.println("This is the subclass 4");
		return (first+second);
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.Interface.Math#sub(int, int)
	 */
	@Override
	public int sub(int first, int second) {
		System.out.println("This is the subclass 4");
		return (first-second);
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.Interface.Math#mul(int, int)
	 */
	@Override
	public int mul(int first, int second) {
		System.out.println("This is the subclass 4");
		return (first*second);
	}

}
