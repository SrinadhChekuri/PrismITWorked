package com.prismit.training;
import java.util.Scanner;

public class largenumber {
	public static void main(String[] args) {
		
		Double first,second,third;
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("Enter first numbers");
		
		first=num.nextDouble();
		System.out.println("Enter second numbers");
		second= num.nextDouble();
		System.out.println("Enter third numbers");
		third= num.nextDouble();
		
		if (first > second && first > third) {
				System.out.println("First number is bigger");
			}
		else if(second > first && second > third) {
				System.out.println("Second number is bigger");
			}
		else
				System.out.println("Third number is bigger");
		}
		
		
	}
	


