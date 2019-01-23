/**
Program to insert values into employee table
 * 
 */
package com.prismitcorp.basic.dao;
import java.sql.*;


/**
 * @author  planet
 *version 1.8.0 2018-12
 */
public class DisplayEmployeeTable {

	/**
	 * @param args
	 */
	// JDBC Driver name and DB-URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	static final String DB_URL="jdbc:mysql://localhost:3306/didb";
	// database user name and password
	static final String USER="root";
	static final String PASS="srinadh.123";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//providing connection and statement
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		//establishing the connection to database
		System.out.println("Connecting to selected databse");
		con=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("Connected to selected databse");
		//inserting values into table
		System.out.println("Displaying the employee table");
		stmt=con.createStatement();
		//String sql="Select * from employee";
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next())
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		//stmt.executeQuery(sql);
		//System.out.println("Updated values into employee table");
		}catch(SQLException se) {
			//handle errors of JDBC
			se.printStackTrace();
		}catch(Exception e) {
			//handle errors of Calss.forName
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
					con.close();
			}catch(SQLException se) {
				
			}try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				
			}//end finally try
		}//end try
		//System.out.println("Good luck");
	}

}