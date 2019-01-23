/**program to combine the two multidimentioanl array
 * 
 */
package com.prismit.basic.jan18;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class CombineingMultidimentionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the multidimentional arrays
		int [][] array1= { {1,2,3},{4,5,6}};
		int [][] array2= { {7,8,9},{10,11,12}}; 
		//int length=array1.length+array2.length;
		int rowlength=array1[0].length+array2[0].length;
		int collength=array1[1].length+array2[1].length;
		int [][] array3=new int[rowlength][collength];
		int row=0;
		int col=0;
		for(int arr:array1) {
			array3[row][col]=arr;
			row++;
			col++;
		}
		for (int[ ] element:array2) {
			array3[row][col]=element;
			row++;
			col++;
		}
		System.out.println(Arrays.deepToString(array3));

	}

}
