package com.ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAllEx {

	public static void main(String[] args) throws Exception{
		 
			
		    Class.forName("com.mysql.jdbc.Driver");
		  
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
		  
		  
		  PreparedStatement ps = connection.prepareStatement("select * from Student");  
		  ResultSet rs = ps.executeQuery();
		  while(rs.next()) {
			  String sno = rs.getString(1);
			  String sname =rs.getString(2);
			  String sdob = rs.getString(3);
			  String sdoj =rs.getString(4);
			  System.out.println(sno);
			  System.out.println(sname);
			  System.out.println(sdob);
			  System.out.println(sdoj);
			 
		  }
		
	}

}
