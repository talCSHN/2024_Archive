package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {


	      String driver ="com.mysql.cj.jdbc.Driver";
	      String url = "jdbc:mysql://localhost:3306/myschema";
	      String userid ="root";
	      String passwd = "1234";
		
	      
	      try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	      
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
			  con =  DriverManager.getConnection(url, userid, passwd);
			  
		      String sql = "select UserID, UserName, Email, PhoneNumber, UserSSN from tb_User"; 
		      
		      pstmt = con.prepareStatement(sql);
		      
		      rs  = pstmt.executeQuery();
		      
		      while(rs.next()) {
		    	  String UserID = rs.getString("UserID");
		    	  String UserName = rs.getString(2);
		    	  String Email = rs.getString("Email");
		    	  String PhoneNumber = rs.getString("PhoneNumber");
		    	  String UserSSN = rs.getString("UserSSN");
		    	  System.out.println(UserID+"\t"+UserName+"\t"+Email+"\t"+PhoneNumber+"\t"+UserSSN);
		      }
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			
			   
			   try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		  }//end finally
	      

	       
	    
	       
	      
	}//end main
}//end class



