/**program to find the vowels and consonents
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class VowelsConsonents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character: ");
		c=scanner.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("The given character is a vowel: "+c);
		}else {
			System.out.println("The given character is a consonent: "+c);
		}
		

	}

}
