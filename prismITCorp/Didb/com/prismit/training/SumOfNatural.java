/*
 * Program to find the sum of Natural numbers
 * */
package com.prismit.training;
import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args) {
		int num,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		for(int initial=1;initial<=num;initial++) {
			sum=sum+initial;
		}
		System.out.println("the sum of natural number is: "+sum);
	}

}
