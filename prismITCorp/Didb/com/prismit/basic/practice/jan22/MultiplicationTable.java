/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the table number:");
		num=scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d",num,i,num*i);
			System.out.println();
		}
		

	}

}
