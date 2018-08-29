/*
Write a java program that establishes a connection to oracle database successfully. 
If the connection is successful, it should display a message “Connection Established 
successfully”. In case, it is not able to do so due to any exception, it should 
display the message “Connection could  not be established “. If there is an 
exception, it should also display the description of the exception.
 */

package com.w3epic.wiprotraining.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment1 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
			System.out.println("Connection Established successfully");
		} catch (Exception e) {
			System.out.println("Connection could  not be established");
		} finally {
			if (conn != null) conn.close();
		}
	}

}
