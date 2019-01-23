/**
 * 
 */
package com.prismit.basic.jan18;

/**
 * @author chellphone planet
 *
 */
public class ToyotaCar2019 extends Common {

	/**
	 * 
	 */
	public ToyotaCar2019() {
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.Common#add(int, int)
	 */
	@Override
	public int add(int firstNumber, int secondNumber) {
		System.out.println("This is implemented by toyota 2019 addition");
		return (firstNumber+secondNumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.Common#sub(int, int)
	 */
	@Override
	public int sub(int firstNumber, int secondNumber) {
		System.out.println("This is implemented by toyota 2019 subtraction");
		return (firstNumber-secondNumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.Common#mul(int, int)
	 */
	@Override
	public int mul(int firstNumber, int secondNumber) {
		System.out.println("This is implemented by toyota 2019 multiplycation");
		return (firstNumber*secondNumber);
	}

}
