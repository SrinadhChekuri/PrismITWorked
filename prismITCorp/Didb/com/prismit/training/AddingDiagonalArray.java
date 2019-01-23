/**program to find the sum of the diagonal in array
 * 
 */
package com.prismit.training;
import java.util.Scanner;

/**
 * @author  planet
 * version 1.8.0 2018-12
 *
 */
public class AddingDiagonalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col,sum=0,i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		row=scanner.nextInt();
		System.out.println("Enter the number of columns:");
		col=scanner.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("Enter the elements inn the matrix: ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				mat[i][j]=scanner.nextInt();
			}
		}
		System.out.println("The entered arrary is: ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println(" ");
		}
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(i==j) {
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println("The sum of diaglonal array is:"+sum);

	}

}
