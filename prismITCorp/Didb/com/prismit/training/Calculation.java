package com.prismit.training;
import java.util.Scanner;

public class Calculation {
public static void main(String [] args) {
	int i,value,sum=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the value: ");
    value=scanner.nextInt();
    for (i=1; i<=value; i++) {
    	sum=sum+i;
    }
    System.out.println("The sum of the natural number is:" +sum);
}
}
