/*
In the just concluded exercise, where you have established the connection 
successfully, exclude the registration process(by commenting the line 
containing the code Class.forName(“..”)). Observe the result.
 */

package com.w3epic.wiprotraining.assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment2 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		
		try {			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
			System.out.println("Connection Established successfully");
		} catch (Exception e) {
			System.out.println("Connection could  not be established");
		} finally {
			if (conn != null) conn.close();
		}
	}

}
