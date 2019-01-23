/**
program to find the electricity bill
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class ElectericityBill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double units,bill=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entert the number of units utilised: ");
		units=scanner.nextDouble();
		//the price for units is (for 100 units is 1.50)(for morethan 100 and less than 300 is 2.50) (for more than 300 is 3.50)
		if(units<=100) {
			//bill if we utilized less than 100 units
			bill=bill+(units*1.50);
			System.out.println("The bill is: "+bill);
		}else if(units<=300) {
			bill=bill+(100*1.50)+((units-100)*2.50);
			System.out.println("The bill is: "+bill);
		}else if(units>300) {
			bill=bill+(100*1.50)+(200*2.50)+((units-300)*3.50);
			System.out.println("the bill is:"+bill);
		}
		

	}

}
