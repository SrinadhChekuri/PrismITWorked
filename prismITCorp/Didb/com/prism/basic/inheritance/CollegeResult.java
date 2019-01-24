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
		impel.student1(1, "hari", "ss");
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getAddress());
		
		//assigning the student2 values and printing his credentials
		impel.student2(2, "srinadh", "chek");
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getAddress());
		
		//assigning the faculty values and printing  credentials
		impel.faculty(101, "prof.din", "philip");
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getAddress());
		
		
        
	}

}