/**program to fins the distance between two points
 * 
 */
package com.prismit.basic.jan16;

/**
 * @author  planet
 *
 */
public class SquarerootPow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xpoint1=6,xpoint2=3,ypoint1=5,ypoint2=8;
		double distance;
		distance=Math.sqrt((Math.pow((xpoint2-xpoint1), 2))+Math.pow((xpoint2-xpoint1), 2));
		System.out.println("The distance is: "+distance);

	}

}
