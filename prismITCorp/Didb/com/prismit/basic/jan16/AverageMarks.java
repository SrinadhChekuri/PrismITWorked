/**program to find average of marks in arrays
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018.12
 *
 */
public class AverageMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subjects[]= {60,75,80,40,95,89};
		double average = 0,sum=0;
		for(int subject=0;subject<subjects.length;subject++) {
			sum=sum+subjects[subject];
			average=sum/subjects.length;
		}
		System.out.println("The average of marks is: "+average);

	}

}
