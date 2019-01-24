/**
 * 
 */
package com.prism.basic.inheritance;

/**
 * @author cheku
 *
 */
public class CollegeImpel2 extends CollegeImpel{
	//declaring the method faculty and declard the variables
	public static void faculty(int fid,String ffirstname, String flastname, String Designation) {
		int id=fid;
		String firstname=ffirstname;
		String lastname=flastname;
		String designation=Designation;
		//printnig the assigned values of the faculty
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(designation);
		
	}

}
