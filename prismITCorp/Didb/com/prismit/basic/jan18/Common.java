package com.prismit.basic.jan18;

public abstract class Common {
	// just declaring the abstract methods for addition. not  implementing
	public abstract int add(int firstNumber, int secondNumber);
	// just declaring the abstract methods for subtraction not  implementing
	public abstract int sub(int firstNumber, int secondNumber);
	// just declaring the abstract methods for multiplycation not  implementing
	public abstract int mul(int firstNumber, int secondNumber);
	//this method is implemented by us.
	public int div(int firstNumber, int secondNumber) {
		System.out.println("This is implemented by  2019 division");
		return (firstNumber/secondNumber);
	}

}
