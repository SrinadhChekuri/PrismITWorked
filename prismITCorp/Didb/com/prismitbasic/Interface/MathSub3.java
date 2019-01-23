/**
 * 
 */
package com.prismitbasic.Interface;

/**
 * @author cheku
 *
 */
public class MathSub3 implements Math {

	/**
	 * 
	 */
	public MathSub3() {
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.abst.Math#add(int, int)
	 */
	@Override
	public int add(int first, int second) {
		System.out.println("This is subclass 3");
		return (first+second);
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.abst.Math#sub(int, int)
	 */
	@Override
	public int sub(int first, int second) {
		System.out.println("This is subclass 3");
		return (first-second);
	}

	/* (non-Javadoc)
	 * @see com.prismitbasic.abst.Math#mul(int, int)
	 */
	@Override
	public int mul(int first, int second) {
		System.out.println("This is subclass 3");
		return (first*second);
	}

}
