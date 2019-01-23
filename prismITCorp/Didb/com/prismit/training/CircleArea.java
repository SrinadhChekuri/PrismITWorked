/**
program to find the area of circle
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class CircleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius:" );
		radius=scanner.nextInt();
		area=(22*radius*radius)/7;
		System.out.println("The area is: "+area);

	}

}
