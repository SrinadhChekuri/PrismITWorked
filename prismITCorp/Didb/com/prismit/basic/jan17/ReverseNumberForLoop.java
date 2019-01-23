/**program to print the reversing the number using for loop
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class ReverseNumberForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the variables
		int num,reversenum=0;
		Scanner scanner=new Scanner(System.in);
		//asking to enter the number
		System.out.println("Enter the number");
		//storing the entered number
		num=scanner.nextInt();
		//if number !=0 then go inside the loop
		for(;num!=0;) {
			reversenum=reversenum*10;;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		//printing the reverse number in console
		System.out.println("The reverse number is: "+reversenum);

	}

}
