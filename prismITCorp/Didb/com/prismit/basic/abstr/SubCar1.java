/**
 * 
 */
package com.prismit.basic.abstr;

/**
 * @author cheku
 *
 */
public   class SubCar1 extends Cars {
	
	public SubCar1() {
	}

	@Override
	public int add(int first, int second) {
		System.out.println("This is sub Class 1");
		return (first+second);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.abstr.Cars#sub(int, int)
	 */
	@Override
	public int sub(int first, int second) {
		System.out.println("This is sub Class 1");
		return (first-second);
	}

}
