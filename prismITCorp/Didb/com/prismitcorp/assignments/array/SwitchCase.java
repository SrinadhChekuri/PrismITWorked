/**
 * 
 */
package com.prismitcorp.assignments.array;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character: ");
		c=scanner.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
			System.out.println("Entered character is an vowel: "+c);
			break;
			default:
			System.out.println("its not vowel: "+c);
		
		}
		

	}

}
