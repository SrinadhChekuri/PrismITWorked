/**program to find the number is in the given array or not
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class ToFindArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {32,6,3,6,4,7};
		boolean found=false;
		int tofind=7;
		for(int check : num) {
			if(check==tofind) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("The number is found:"+tofind);
		
		else {
			
			System.out.println("is not found: "+tofind);
		}
		
		}
	}


