/**program to find the given number is alphabet or not
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 *
 */
public class AlphabetOrNot {

	public static char aLetter = 'a';
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character: ");
		c=scanner.next().charAt(0);
		if((c>=aLetter && c>='z') || (c>='A' && c>='Z')) {
			System.out.println("The value is a character");
		}else {
			System.out.println("The value is not a character");
		}
	}
}
