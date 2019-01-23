/**
 * 
 */
package com.prismit.basic.practice.jan22;
import java.util.Scanner;

/**
 * @author cheku
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,remainder,result=0,temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		temp=num;
		while(temp!=0) {
			remainder=temp%10;
			result=(result*10)+remainder;
			temp=temp/10;
		}if(result==num) {
			System.out.println("The number is palindrome: "+num);
		}else {
			System.out.println("The number is not palindrome: "+num);
		}
		
		

	}

}
