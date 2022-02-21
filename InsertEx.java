package com.ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEx {

	public static void main(String[] args) throws Exception {
		
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the Student_no");
			String sno = s.nextLine();
			
			System.out.println("Enter Student_name");
			String sname = s.nextLine();
			
			System.out.println("Enter Student_DOB");
			String sdob = s.nextLine();
			
			System.out.println("Enter Student_DOJ");
			String sdoj = s.nextLine();
			
		    Class.forName("com.mysql.jdbc.Driver");
		  
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
		  
		  
		  PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?)");  
          
         ps.setString(1,sno);
 		 ps.setString(2,sname);
 		 ps.setString(3,sdob);
 		 ps.setString(4,sdoj);
 		 
 		int k = ps.executeUpdate();
 		if(k>0){
			 System.out.println("student details inserted successfully..");
		 }
		 connection.close();
		 s.close();
	}
		

	}


