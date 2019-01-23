/**
 * 
 */
package com.prismit.basic.jan18;

/**
 * @author chellphone planet
 *
 */
public class MathFunctionOverLoading implements IMathOL {

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.IMathOL#add(int, int)
	 */
	@Override
	public int add(int firstNUmber, int secondNumber) {
		System.out.println("This is addition for 2 numbers");
		return (firstNUmber+secondNumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.IMathOL#add(int, int, int)
	 */
	@Override
	public int add(int firstNumber, int secondNumber, int thirdNumber) {
		System.out.println("This is addition for 3 numbers");
		return (firstNumber+secondNumber+thirdNumber);
	}

	/* (non-Javadoc)
	 * @see com.prismit.basic.jan18.IMathOL#add(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String add(String firstName, String secondName, String thirdName) {
		System.out.println("This is addition for 2 strings");
		return (firstName+secondName+thirdName);
	}

}
