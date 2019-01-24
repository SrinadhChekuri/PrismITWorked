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
	public static void student1(int Sid, String Sfirstname, String Slastname, String Course) {
		//super();
		/*Sid=1;
		Sfirstname="srinadh";
		Slastname="ss";*/
		int id=Sid;
		String firstname=Sfirstname;
		String lastname=Slastname;
		String course=Course;
		//printing the student1 assigned values
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(course);

	}
	//declaring the method student2 and declaring the variables
	public static void student2(int Sid, String Sfirstname, String Slastname, String Course)
	{
		
		int id=Sid;
		String firstname=Sfirstname;
		String lastname=Slastname;
		String course=Course;
		//printing the student2 assigned values
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(course);
	}

}
