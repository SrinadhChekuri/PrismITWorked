/**
 * 
 */
package com.prism.basic.inheritance;

/**
 * @author cheku
 *
 */
public class CollegeResult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CollegeImpel2 impel=new CollegeImpel2();
		//assigning the student1 values and printing his credentials
		impel.student1(1, "hari", "ss","Masters");
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getState());
		System.out.println(impel.getAddress());
		System.out.println();
		
		//assigning the student2 values and printing his credentials
		impel.student2(2, "srinadh", "chek","Bachelors");
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getState());
		System.out.println(impel.getAddress());
		System.out.println();
		
		
		//assigning the faculty values and printing  credentials
		impel.faculty(101, "prof.din", "philip","professor");
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getState());
		System.out.println(impel.getAddress());
		System.out.println();
		
		
		
        
	}

}