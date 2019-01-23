/**
program to find the distance between two pints
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class DistanceBetweenTwoPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xpoint1,xpoint2,ypoint1,ypoint2;
		double distance;
		Scanner scanner=new Scanner(System.in);
		System.out.println("The value of xpoint1 is:");
		xpoint1=scanner.nextDouble();
		System.out.println("The value of xpoint2 is:");
		xpoint2=scanner.nextDouble();
		System.out.println("The value of ypoint1 is:");
		ypoint1=scanner.nextDouble();
		System.out.println("The value of ypoint2 is:");
		ypoint2=scanner.nextDouble();
		distance=Math.sqrt(((xpoint2-xpoint1)*(xpoint2-xpoint1))+((ypoint2-ypoint1)*(ypoint2-ypoint1)));
		System.out.println("the distance between two number is: "+distance);

	}

}
