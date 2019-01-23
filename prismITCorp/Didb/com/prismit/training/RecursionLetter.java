/* program to reverse the string based on letters*/
package com.prismit.training;
import java.util.Scanner;    /* imported the scanner*/

public class RecursionLetter {
	public static void main(String[] args) {
        char word;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input= scanner.nextLine();
		String[] chars= input.split("");
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
	}

}
