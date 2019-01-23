/**program to print the pattern depends on rows
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class PatternIncreasing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows=scanner.nextInt();
		for(int value=1;value<=rows;value++) {
			for(int columns=1;columns<=value;columns++) {
				System.out.print(columns+" ");
			}
			System.out.println( );
		}

	}

}
