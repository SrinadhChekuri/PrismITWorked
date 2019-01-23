/**program to display the math tabel
 * 
 */
package com.prismit.basic.jan17;
import java.util.Scanner;
/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class MathTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the variable
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		//storing the entered value in num
		num=scanner.nextInt();
		for(int digit=1;digit<=10;digit++) {
			System.out.printf("%d*%d=%d\n",num,digit,num*digit );
		}
		
		

	}

}
