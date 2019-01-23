/**
program to find the batting average of a Batsman
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class BattingAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Matches, runs,Innings, Notouts;
		double average;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of matches played: ");
		Matches=scanner.nextInt();
		System.out.println("Enter the number of Innings played: ");
		Innings=scanner.nextInt();
		System.out.println("Enter the number of Notouts ");
		Notouts=scanner.nextInt();
		System.out.println("Enter the number of runs scored ");
		runs=scanner.nextInt();
		/*if the Notouts is equal to Innings played then the average is the runs scored by batsman*/
		if(Innings==Notouts) {
			System.out.println("The average of the batsman is: "+runs);
		}else {
			/**/
			average=runs/(Innings-Notouts);
			System.out.println("The average of batsman is: "+average);
		}

	}

}
