/**
program to find the price of the product after discount when discount given in cash
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class DiscountInMoney {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double originalprice,discount,price, amount;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the originalprice: ");
		System.out.println("Enter the discount amount: ");
		originalprice=scanner.nextDouble();
		discount=scanner.nextDouble();
		price=(originalprice*discount)/100;
		amount = originalprice-price;
		System.out.println("The price of the product after discountis: " +amount);

	}

}
