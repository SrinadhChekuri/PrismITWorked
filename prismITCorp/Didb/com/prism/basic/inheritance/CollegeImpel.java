/**
 * 
 */
package com.prism.basic.inheritance;

/**
 * @author cheku
 *
 */
public class CollegeImpel extends ICollege {
	//declaring the method student1 and declaring the variables
	public static void student1(int Sid, String Sfirstname, String Slastname) {
		//super();
		/*Sid=1;
		Sfirstname="srinadh";
		Slastname="ss";*/
		int id=Sid;
		String firstname=Sfirstname;
		String lastname=Slastname;
		//printing the student1 assigned values
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
		

	}
	//declaring the method student2 and declaring the variables
	public static void student2(int Sid, String Sfirstname, String Slastname)
	{
		
		int id=Sid;
		String firstname=Sfirstname;
		String lastname=Slastname;
		//printing the student2 assigned values
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
	}

}
