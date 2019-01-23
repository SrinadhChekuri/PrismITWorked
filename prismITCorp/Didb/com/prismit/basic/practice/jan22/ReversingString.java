/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class ReversingString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char word;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word:");
		String input=scanner.nextLine();
		String[] chars=input.split("");
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}

	}

}
