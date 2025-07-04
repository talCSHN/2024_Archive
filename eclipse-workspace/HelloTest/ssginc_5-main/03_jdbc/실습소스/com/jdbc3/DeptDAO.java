package com.jdbc3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 역할: MySQL DB 연동
// DAO 패턴: Data Access Object
public class DeptDAO {

	public List<DeptDTO> select(Connection con) {
		
		 //DTO 누적하는 용도로 ArrayList를 사용한다.
List<DeptDTO> list = new ArrayList<>();
		
		 PreparedStatement pstmt = null;
	     ResultSet rs = null;
	     try {
		      String sql = "select deptno as no, dname, loc from dept"; 
		      
              pstmt = con.prepareStatement(sql);
		      rs  = pstmt.executeQuery();
		      while(rs.next()) {
		    	  int deptno = rs.getInt("no"); // 컬럼헤더값
		    	  String dname = rs.getString(2); // 컬럼헤더 위치값
		    	  String loc = rs.getString("loc"); // 컬럼헤더값
		    	  //DTO 저장하고 누적해야 된다.
DeptDTO dto = new DeptDTO(deptno, dname, loc);
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
