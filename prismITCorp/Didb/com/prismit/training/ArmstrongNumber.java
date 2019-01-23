/**
 * program to find whether given number is Armstrong number or not 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author planet
 * version 1.8.0 2018-12
 *
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, originalnumber, result=0, remainder;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=scanner.nextInt();
		originalnumber=num;
		while(num!=0) {
			remainder=num%10;
			result=result+(remainder*remainder*remainder);
			num=num/10;
		}
		if (result==originalnumber) {
			System.out.println("the given number is Armstrong number: "+originalnumber);
		}else {
			System.out.println("The given number is not an Armstrong number: "+originalnumber);
		}

	}

}
