/**
Program to find the list of Armstrong numbers between the two integers
 * 
 */
package com.prismit.training;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *class initiation starts here
 */
public class FactorialList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low,high,check1,check2,power=0,remainder;
		double result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the two integers: ");
		low=scanner.nextInt();
		high=scanner.nextInt();
		//for loop starts here
		for(int num=low+1; num<high;++num) {
			check1=num;
			check2=num;
			//while loop for check1 staring from here
			while(check1!=0) {
				check1=check1/10;
				++power;
			}
			//while loop for check2 starting here 
			while(check2!=0) {
				remainder=check2%10;
				result=result+ Math.pow(remainder, power);
				check2=check2/10;
			}
			//will check if the result equals to original number or not
			if(result==num) {
				System.out.println("the armstrong numbers are: "+num);
			}
			//resetting the values to find the Armstrong number for next integer
			power=0;
			result=0;
		}
		//return 0;
		

	}

}
