/**
 * 
 */
package com.prismit.basic.abstr;

/**
 * @author cheku
 *
 */
public abstract class Example extends Cars {

	/* (non-Javadoc)
	 * @see com.prismit.basic.abstr.Cars#add(int, int)
	 */
	@Override
	public int add(int first, int second) {
		return (first+second);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.abstr.Cars#sub(int, int)
	 */
	@Override
	public int sub(int first, int second) {
		return (first+second);
	}

}
