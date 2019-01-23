/**

 * 
 */
package com.prismit.basic.jan18;

/**
 * @author planet
 *
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	Math car = new ToyotaCar();
		// don't care wheteher it is toyota and Bmw.you have to follow the interafce
		// provided by government
		car.add(10, 20);
		car.sub(10, 20);
		car.mul(10, 20); */
		
 
		BmwCar car1 = new BmwCar();
		// don't care wheteher it is toyota and Bmw.you have to follow the interafce
	   // provided by government
		car1.add(10, 20);
		car1.sub(10, 20);
		car1.mul(10, 20);  
		car1.div(10,20);
	}

}
