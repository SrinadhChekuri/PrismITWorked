/**
 * 
 */
package com.prismitcorp.assignments.array;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @author cheku
 *
 */
public class ReturnString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="srinadh";
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter the name");
		//str=scanner.nextLine();
		String reverse="";
		for(int i=(str.length())-1;i>=0;i-- ) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
