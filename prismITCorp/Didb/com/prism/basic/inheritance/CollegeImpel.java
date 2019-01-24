/**
 * 
 */
package com.prism.basic.inheritance;

/**
 * @author cheku
 *
 */
public class CollegeImpel extends ICollege {
	public static void student1(int Sid, String Sfirstname, String Slastname) {
		//super();
		/*Sid=1;
		Sfirstname="srinadh";
		Slastname="ss";*/
		int id=Sid;
		String firstname=Sfirstname;
		String lastname=Slastname;
		System.out.println(id+" "+firstname+" "+lastname);

	}
	
	public static void student2(int Sid, String Sfirstname, String Slastname)
	{
		
		int id=Sid;
		String firstname=Sfirstname;
		String lastname=Slastname;
		System.out.println(id+" "+firstname+" "+lastname);
	}

}
