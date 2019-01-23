/**program to find the electricity bill
 * 
 */
package com.prismit.basic.jan16;
import java.util.Scanner;

/**
 * @author  planet
 *version 1.8.0 2018-12
 */
public class ElectricityBill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double units,bill;
		System.out.println("ENter the number of unites consumed:");
		Scanner scanner=new Scanner(System.in);
		units=scanner.nextDouble();
		if(units<=100) {
			//if the units consumed less or equal to 100 units then each unit cost is 1.50
			bill=units*1.50;
			System.out.println("The bill is: "+bill);
		}else if(units<=300) {
			//if units >100 and <300. then in first 100 units each unit is 1.50. Then for >100 units each unit is 2.50
			bill=(100*1.50)+((units-100)*2.50);
			System.out.println("The bill is: "+bill);
		}else if(units>300) {
			bill=(100*1.50)+(200*2.50)+((units-300)*3.50);
			System.out.println("The bill is: "+bill);
		}else {
			System.out.println("do nothing.");
		}
		

	}

}
