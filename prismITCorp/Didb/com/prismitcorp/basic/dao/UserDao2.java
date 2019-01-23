/**
 * Program to create table in local database 
 */
package com.prismitcorp.basic.dao;
import java.sql.*;

public class UserDao2 {
	// JDBC driver name and DB_URL
	static final String JDBC_DRIVER="com.sql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/didb";
	// providing user name and password for MySQL
	static final String USER="root";
	static final String PASS="srinadh.123";
	public static void main(String[] args) {
		//connections and statements
		Connection con= null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to selected database");
			con=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected to selected database");
			//creating table in database
			System.out.println("Creating the table in selected databse");
			stmt=con.createStatement();
			String sql="Create Table Employee"+
			            "(eid integer not NULL, "+
			            "first_name Varchar(50), "+
			            "last_name Varchar(50), "+
			            "address Varchar(50), "+
			            "Primary key (eid))";
			stmt.executeUpdate(sql);
			System.out.println("Employee Table created");	
		}catch(SQLException se){
			//handle errors of jdbc 
			se.printStackTrace();
		}catch(Exception e) {
			//handle errors of Class.forName
			e.printStackTrace();
		}finally {
			//finally is used to close all the connections
			try {
				if(stmt!=null) 
					con.close();
				} catch(SQLException se) {
					//do nothing
				}
				try {
					if(con!=null)
					con.close();
				} catch(SQLException se) {
					
				}
			}// finally braces closed
		System.out.println("Best of luck");
		}
		
		
		
	}
	

