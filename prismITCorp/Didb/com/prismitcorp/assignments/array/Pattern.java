/**
 * 
 */
package com.prismitcorp.assignments.array;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows:" );
		num=scanner.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=num-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
