/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enther the number of rows: ");
		rows=scanner.nextInt();
		for(int value=1;value<=rows;value++) {
			for(int digit=1;digit<=value;digit++) {
				System.out.print(digit+" ");
			}System.out.println();
		}

	}

}
