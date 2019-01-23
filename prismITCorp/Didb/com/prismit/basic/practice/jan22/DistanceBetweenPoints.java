/**program to find the distance between two points
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 * version 1.8.0 2018-12
 *
 */
public class DistanceBetweenPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaring the variables
		int xpoint1, xpoint2, ypoint1, ypoint2;
		double distance;
		Scanner scanner=new Scanner(System.in);
		//asking to enter the xpoint1 value
		System.out.println("Enter the x1 point: ");
		//assigning the value to the xpoint1
		xpoint1=scanner.nextInt();
		//asking to enter the xpoint2 value
		System.out.println("Enter the x2 point: ");
		//assigning the value to the xpoint2
		xpoint2=scanner.nextInt();
		//asking to enter the ypoint1 value
		System.out.println("Enter the y1 point: ");
		//assigning the value to the ypoint1
		ypoint1=scanner.nextInt();
		//asking to enter the ypoint2 value
		System.out.println("Enter the y2 point: ");
		//assigning the value to the ypoint2
		ypoint2=scanner.nextInt();
		//formula to find the distance betwen two points. 
		distance=Math.sqrt((Math.pow((xpoint2-xpoint1), 2))+(Math.pow((ypoint2-ypoint1), 2)));
		//printing the distance
		System.out.println("The distance betwen two points is: "+distance);

	}

}
