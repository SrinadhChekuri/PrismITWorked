/**
 * 
 */
package com.prismitcorp.assignments.math;
import java.lang.*;

/**
 * @author cheku
 *
 */
public class ImplementingMathProgram extends MathProgram {

	/**
	 * 
	 */
	public ImplementingMathProgram() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.MathProgram#rectangle(double, double)
	 */
	@Override
	public void rectangle(double length, double breath) {
		/*length=10;
		breath=5;*/
		double area;
		try {
			area=length*breath;
			System.out.println("Area of rectangle is: "+area);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Arithmatic exception occured");
		}
		

	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.MathProgram#points(int, int, int, int)
	 */
	@Override
	public void points(int xpoint1, int xpoint2, int ypoint1, int ypoint2) {
		/*xpoint1=10;
		xpoint2=20;
		ypoint1=10;
		ypoint2=20;*/
		double distance;
		try {
			distance=Math.sqrt((Math.pow((xpoint2-xpoint1),2))+(Math.pow((ypoint2-ypoint1), 2)));
			System.out.println("The distance between two points is: "+distance);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error occured");
		}

	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.MathProgram#circle(double)
	 */
	@Override
	public void circle(double radius) {
		double area;
		try {
			area=(22/7)*(Math.pow(radius, 2));
			System.out.println("The area of circle is: "+area);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error occured");
		}

	}

}
