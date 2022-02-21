package com.ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectEx {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student_no:");
		int sno = s.nextInt();
		
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
		  PreparedStatement ps = con.prepareStatement("select * from student where Student_no=?");
		  ps.setInt(1, sno);
		  ResultSet rs = ps.executeQuery();
		  while(rs.next()) {
			  
			  String sname =rs.getString(2);
			  String sdob = rs.getString(3);
			  String sdoj =rs.getString(4);
			 
			  System.out.println(sname);
			  System.out.println(sdob);
			  System.out.println(sdoj);
			  
		  }
		  s.close();
	}    

}
