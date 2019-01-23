/**Progrsm to find the compound interest
 * 
 */
package com.prismit.training;
import java.util.Scanner;
import static java.lang.Math.pow;

/**
 * @author  planet
 *version 1.8.0 2018-12
 */
public class CompoundInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount,principal,time,rate,compoundinterest;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		principal=scanner.nextDouble();
		System.out.println("Enter the time amount: ");
		time=scanner.nextDouble();
		System.out.println("Enter the rate amount: ");
		rate=scanner.nextDouble();
		amount=principal*(pow((1+rate/100),time));
        compoundinterest=amount-principal;
        System.out.println("Compound interest is: "+compoundinterest);
	}

}
