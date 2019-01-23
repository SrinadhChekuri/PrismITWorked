/**
 * 
 */
package com.prismit.basic.abstr;

/**
 * @author cheku
 *
 */
public   class SubCar2 extends Cars {

	/**
	 * 
	 */
	public SubCar2() {
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.abstr.Cars#add(int, int)
	 */
	@Override
	public int add(int first, int second) {
		System.out.println("This is suc class 2");
		return (first+second);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.abstr.Cars#sub(int, int)
	 */
	@Override
	public int sub(int first, int second) {
		System.out.println("This is suc class 2");
		return (first-second);
	}

}
