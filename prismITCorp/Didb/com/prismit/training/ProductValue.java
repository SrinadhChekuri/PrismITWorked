package com.prismit.training;
import java.util.Scanner;

public class ProductValue {
	public static void main(String [] args) {
		int num, i, factorial=1;
		Scanner scanner=new Scanner(System.in);		
		System.out.println("Enter the factorial value: ");
		num=scanner.nextInt();
		if (num<0) {
			System.out.println("Error ! you entered a negative number:" +num);
		} else {
			for(i=1; i<=num; ++i) {
				factorial=factorial*i;
			}
			System.out.println("The factorial value is: " +factorial);
		}
	}

}
