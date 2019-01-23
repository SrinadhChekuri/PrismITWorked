/**
 * 
 */
package com.prismit.basic.jan18;

/**
 * @author chellphone planet
 *
 */
public class BmwCar implements Math {

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.Math#add(int, int)
	 */
	@Override
	public int add(int firstNumber, int secondNumber) {
		System.out.println("This implemetaion is done by BMW addition:");
		return (firstNumber+secondNumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.Math#sub(int, int)
	 */
	@Override
	public int sub(int firstNumber, int secondNumber) {
		System.out.println("This implemetaion is done by BMW subtraction:");
		return (firstNumber-secondNumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.Math#mul(int, int)
	 */
	@Override
	public int mul(int firstNUmber, int secondNumber) {
		System.out.println("This implemetaion is done by BMW multiplycation:");
		return (firstNUmber*secondNumber);
	}
	
	public int div(int firstNUmber, int secondNumber) {
		System.out.println("This implemetaion is done by BMW multiplycation:");
		return (firstNUmber/secondNumber);
	}
}
