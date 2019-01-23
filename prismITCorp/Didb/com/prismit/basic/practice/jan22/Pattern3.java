/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows=scanner.nextInt();
		for(int value=1;value<=rows;value++) {
			for(int digit=1;digit<=value;digit++) {
				System.out.print(digit);
			}
			System.out.println();
		}
		for(int value=rows-1;value>=1;value--) {
			for(int digit=1;digit<=value;digit++) {
				System.out.print(digit);
			}
			System.out.println();
		}

	}

}
