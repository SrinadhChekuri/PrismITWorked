/**
program to find the vowel or consonents using switch case
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class VowelWithSwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
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
		
	                   System.out.println("The given character is vowel: "+c);
	                      break;
	         default:
	        	 System.out.println("The given character is consonent: "+c);
		}
			
		}

	}


