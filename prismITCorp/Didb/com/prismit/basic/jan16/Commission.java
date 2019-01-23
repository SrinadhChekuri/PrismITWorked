/**
 * program to find the commission percentage 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class Commission {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount, commission,commissionpercentage;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enther the amount: ");
		amount=scanner.nextDouble();
		System.out.println("Enter the commissionpercentage");
		commissionpercentage=scanner.nextDouble();
		commission=(commissionpercentage/100)*amount;
		System.out.println("The commision is:"+commission);

	}

}
