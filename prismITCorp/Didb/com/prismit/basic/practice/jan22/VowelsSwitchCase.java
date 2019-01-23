/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class VowelsSwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enther the character");
		c=scanner.next().charAt(0);
		switch(c){
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
			System.out.println("The given is character is a vowel: "+c);
			break;
			default:
				System.out.println("The given character is not a vowel: "+c);		
		}
		

	}

}
