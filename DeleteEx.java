package com.ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEx {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student_no you want to delete:");
		int sno = s.nextInt();
				
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
		  PreparedStatement ps = con.prepareStatement("delete from student where Student_no=?");
		  ps.setInt(1, sno);
	 		 
	 		int k = ps.executeUpdate();
	 		if(k>0){
				 System.out.println("deleted successfully..");
			 }
			 
			 s.close();
	
	}

}
