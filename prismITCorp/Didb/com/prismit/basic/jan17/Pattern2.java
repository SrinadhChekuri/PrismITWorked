/**program to print pattern
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;

/**
 * @author  planet
 *
 */
public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		rows=scanner.nextInt();
		for (int value=1;value<=rows;value++) {
			for(int digit=1;digit<=rows-value;digit++) {
				System.out.print(1);
			}
			for(int digit=1;digit<=value;digit++) {
				System.out.print(value);
			}
			System.out.println();
		}

	}

}
