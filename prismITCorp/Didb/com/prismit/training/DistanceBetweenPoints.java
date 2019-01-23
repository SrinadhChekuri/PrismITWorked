/**
Program to find the distance between two points
 * 
 */
package com.prismit.training;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author  planet
 * Version 1.8.0 2018-12
 *
 */
public class DistanceBetweenPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double x1,y1,x2,y2,distance;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the x1 value: ");
		x1=scanner.nextDouble();
		System.out.println("Enter the y1 value: ");
		y1=scanner.nextDouble();
		System.out.println("Enter the x2 value: ");
		x2=scanner.nextDouble();
		System.out.println("Enter the y2 value: ");
		y2=scanner.nextDouble();
		distance=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("The distance of two points is: "+distance);
		

	}

}
