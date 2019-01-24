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
		CollegeImpel impel=new CollegeImpel();
		impel.student1(1, "hari", "ss");
		impel.student2(2, "srinadh", "chek");
		//System.out.println(impel.student1();
		System.out.println(impel.getCollegeName());
		System.out.println(impel.getLocation());
		System.out.println(impel.getAddress());
        
	}

}