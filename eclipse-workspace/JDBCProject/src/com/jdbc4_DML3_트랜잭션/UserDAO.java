package com.jdbc4_DML3_트랜잭션;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 역할: MySQL DB 연동
// DAO 패턴: Data Access Object
public class UserDAO {

	// 부서 삭제
	public int delete(Connection con, String UserID) {
int n = 0;
		 PreparedStatement pstmt = null;
	     try {
String sql = "delete from tb_User where UserID=?";
             pstmt = con.prepareStatement(sql);
pstmt.setNString(1, UserID);
n = pstmt.executeUpdate();
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			   try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {e.printStackTrace();}
		  }//end finally
return n;		
	}
	
	
	
	
	
	//부서 저장
	public int insert(Connection con, UserDTO dto)
throws DuplicatedUserException{
      int n = 0;
		 PreparedStatement pstmt = null;
	     try {
	    	  String sql = "insert into tb_User ( UserID, Username, Email, PhoneNumber, UserSSN ) "
		  		       + " values (?,?,?,?,?)";
              pstmt = con.prepareStatement(sql);
      pstmt.setString(1, dto.getUserID());
      pstmt.setString(2, dto.getUserName());
      pstmt.setString(3, dto.getEmail());
      pstmt.setString(4, dto.getPhoneNumber());
      pstmt.setString(5, dto.getUserSSN());
      n = pstmt.executeUpdate();
		  }catch (SQLException e) {
			
// 중복예외처리 클래스를 만들고 명시적으로 생성한다.
throw new DuplicatedUserException(dto.getUserID()+" 값이 중복");
			  
		  }finally {
			   try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {e.printStackTrace();}
		  }//end finally
return n;
	}//end insert
	

	
	
	// 목록보기
	public List<UserDTO> select(Connection con) {
		
		 //DTO 누적하는 용도로 ArrayList를 사용한다.
List<UserDTO> list = new ArrayList<>();
		
		 PreparedStatement pstmt = null;
	     ResultSet rs = null;
	     try {
		      String sql = "select UserID, Username, Email, PhoneNumber, UserSSN from tb_User"; 
		      
              pstmt = con.prepareStatement(sql);
		      rs  = pstmt.executeQuery();
		      while(rs.next()) {
		    	  String UserID = rs.getString("UserID"); // 컬럼헤더값
		    	  String Username = rs.getString(2); // 컬럼헤더 위치값
		    	  String Email = rs.getString("Email"); // 컬럼헤더값
		    	  String PhoneNumber = rs.getString("PhoneNumber");
		    	  String UserSSN = rs.getString("UserSSN");
		    	  //DTO 저장하고 누적해야 된다.
UserDTO dto = new UserDTO(UserID, Username, Email, PhoneNumber, UserSSN);
list.add(dto);
		      }
		  }catch (SQLException e) {
			e.printStackTrace();
		  }finally {
			   try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }//end finally
	     
return list;
	}//end select
}