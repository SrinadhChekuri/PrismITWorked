/**
 * 
 */
package com.prismit.basic.jan18;

/**
 * @author chellphone planet
 *
 */
public class Customer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	//initializing the toyotacar2019 in the main method
	Common car=new ToyotaCar2019();
	car.add(10, 20);
	car.sub(10, 20);
	car.mul(10, 20);
	car.div(10, 20);
	
	
	
	Common car1=new Bmw2019();
	//initializing the toyotacar2019 in the main method
	car1.add(10, 20);
	car1.sub(10, 20);
	car1.mul(10, 20);
	car1.div(10, 20);*/
		
		
		
		IMathOL iMathOL=new MathFunctionOverLoading();
		System.out.println(iMathOL.add(10, 20,30));
		
		System.out.println(iMathOL.add(10, 20));
		
		
		System.out.println(iMathOL.add("balu"," krishna","sai"));
		
	
		
	

	}

}
