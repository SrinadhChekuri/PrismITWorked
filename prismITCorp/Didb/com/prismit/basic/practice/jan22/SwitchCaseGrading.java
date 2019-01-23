/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class SwitchCaseGrading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char grade;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the grade: ");
		grade=scanner.next().charAt(0);
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalid grade");
		}
		System.out.println("your grade is: "+grade);

	}

}
