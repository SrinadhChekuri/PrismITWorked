/**program to display the pattern
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class Pattern7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		rows=scanner.nextInt();
		for(int value=rows;value>=1;value--) {
			for(int digit=1;digit<=value;digit++) {
				System.out.print(digit+" ");
			}
			System.out.println();
		}
	}
}
