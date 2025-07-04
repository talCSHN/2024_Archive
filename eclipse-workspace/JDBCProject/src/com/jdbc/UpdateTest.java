package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) {

		// Dept 테이블 조회
		  // 1) mysql 접속 정보
	      String driver ="com.mysql.cj.jdbc.Driver";
	      String url = "jdbc:mysql://localhost:3306/myschema";
	      String userid ="root";
	      String passwd = "1234";
		
	      // 2) 드라이버 로딩
	      try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	      
	      //3) Connection 연결
	      Connection con = null;
	      PreparedStatement pstmt = null;

	      try {
			  con =  DriverManager.getConnection(url, userid, passwd);
			  // 4) sql문 작성 ==> 문장끝의 ; 반드시 제외.
		      
			  String sql = "update tb_User "
			  		      + " set UserName=? , Email=? , PhoneNumber=? , UserSSN=? "
			  		      + " where UserID=?";
		      // 5) PreparedStatement 얻기 (sql문 전송 담당 객체)
		      pstmt = con.prepareStatement(sql);
		      

		      
		      pstmt.setString(2, "이재명");
		      pstmt.setString(3, "leejaemyong@gmail.com");	
		      pstmt.setString(4, "010-3365-5512");
		      pstmt.setString(5, "651224-1174685");
		      pstmt.setString(1, "E032");
		      /*Scanner scanner = new Scanner(System.in);
		      String UserID = scanner.next();
		      String UserName = scanner.next();
		      String Email = scanner.next();
		      String PhoneNumber = scanner.next();
		      String UserSSN = scanner.next();
		      System.out.println(UserID + UserName + Email + PhoneNumber + UserSSN);
		      scanner.close();*/
		      
		      
		      // 6) sql 문 전송. ==> DML 은  정수로 반환. 
	 		  int n = pstmt.executeUpdate();
	 		  System.out.println(n + " 개가 수정됨.");
	 		  
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			   //8. 역순
			   try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }//end finally
	      

	       
	    
	       
	      
	}//end main
}//end class



