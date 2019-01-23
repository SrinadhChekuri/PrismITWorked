package com.prismit.training;
import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double first,second,product;
		
		Scanner multiple=new Scanner(System.in);
		
		System.out.println("Enter the first value: ");
		first=multiple.nextDouble();
		
		System.out.println("Enter the second value: ");
		second=multiple.nextDouble();
		
		product= first * second;
		
		System.out.println("The product is:" +product);
		
		
		

	}

}
