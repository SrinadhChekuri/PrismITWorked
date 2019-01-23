/**
program to fidn the larger number between the numbers
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * varsion 1.8.00 2018-12
 *
 */
public class LargerNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3, num4;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enther the num1 value; ");
		num1=scanner.nextInt();
		System.out.println("Enther the num2 value; ");
		num2=scanner.nextInt();
		System.out.println("Enther the num3 value; ");
		num3=scanner.nextInt();
		System.out.println("Enther the num4 value; ");
		num4=scanner.nextInt();
		if(num1>num2 && num1>num3 && num1>num4) {
			System.out.println("num1 is greater: "+num1);
		}else if(num2>num1 && num2>num3 && num2>num4) {
			System.out.println("num2 is greater: "+num2);
		}else if(num3>num1 && num3>num2 && num3>num4) {
			System.out.println("num3 is greater: "+num3);
		}else {
				System.out.println("num4 is greater: "+num4);
		}
	}

}
