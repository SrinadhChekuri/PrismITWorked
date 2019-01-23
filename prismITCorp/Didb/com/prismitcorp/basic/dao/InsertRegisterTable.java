/**program to insert values for the Registration table
 * 
 */
package com.prismitcorp.basic.dao;
import java.sql.*;

/**
 * @author  planet
 *version 1.8.0 2018-12
 */
public class InsertRegisterTable {

	/**
	 * @param args
	 */
	//giving JDBC driver path and DB_URL
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/didb";
	//giving usename and password for the database
	static final String USER="root";
	static final String PASS="srinadh.123";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName(JDBC_DRIVER);
		//establishing connection to database
		System.out.println("Connecting to the selected database");
		con=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("Connected to the selected database");
		//query execution 
		System.out.println("Inserting into Registration table");
		stmt=con.createStatement();
		String sql="Insert into registration values (1,'rex','gold',45),(2,'john','smith',35),(3,'kenly','water',50),"
			      	+ "(4,'chris','lynn',28)";
		stmt.executeUpdate(sql);
		System.out.println("Th data is inserted into the Registration Table");
		}catch(SQLException se) {
			//handle the JDBC errors
			se.printStackTrace();
		}catch(Exception e) {
			//handle the Class.forName errors
			e.printStackTrace();
		}
		//finally was used to close all the connections
		finally {
			try {
				if(stmt!=null)
					con.close();
			}catch(SQLException se) {
				//do nothing
			}try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				//do nothing
			}//finally try closed
		}//finally close
		System.out.println("Good Luck");
	}
		

}
