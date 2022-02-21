package com.ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 

public class UpdateEx {

	public static void main(String[] args) throws Exception {
		 
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
		  PreparedStatement ps = con.prepareStatement("update Student SET Student_name='Janavi' WHERE Student_no=5");
		      
		  int k = ps.executeUpdate();
		  if(k>0){
				 System.out.println("Updated successfully..");
			 } 
		  }
	}


