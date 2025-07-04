package com.jdbc4_DML3_트랜잭션;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

//역할: -비즈니즈로직코드(가공), -트랜잭션처리(*****)
// Connection con 까지만 얻으면 됨.
public class UserServiceImpl implements UserService {

	      String driver ="com.mysql.cj.jdbc.Driver";
	      String url = "jdbc:mysql://localhost:3306/myschema";
	      String userid ="root";
	      String passwd = "1234";
	      
	      //생성자
	      public UserServiceImpl() {
	    	try {
	   			Class.forName(driver);
	   		} catch (ClassNotFoundException e) {
	   			e.printStackTrace();
	   		} 
	      }
	      
	      // 메서드
	      @Override
public List<UserDTO> select() {
List<UserDTO> list = null;
	    	  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  UserDAO dao = new  UserDAO();
 list = dao.select(con);
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
return list;
	      }//end select

		@Override
		public int insert(UserDTO dto) 
throws DuplicatedUserException{
			int n = 0;
			  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  UserDAO dao = new  UserDAO();
				  n = dao.insert(con, dto);
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
	    	  return n;
		}

		@Override
		public int delete(String UserID) {
			int n = 0;
			  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  UserDAO dao = new  UserDAO();
n = dao.delete(con, UserID);
	    	  }catch (SQLException e) {
	  			e.printStackTrace();
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
	    	  return n;
		}

		@Override
		public int insertDelete(UserDTO dto, String UserID) throws DuplicatedUserException {
			int n = 0;
			  Connection con = null;
	    	  try {
				  con =  DriverManager.getConnection(url, userid, passwd);
				  //DeptDAO 연동
				  UserDAO dao = new  UserDAO();
con.setAutoCommit(false);
dao.delete(con, UserID);
dao.insert(con, dto);
con.commit();
	    	  }catch (SQLException e) {
try {
	con.rollback();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}	    		  	
	  		  }finally {
	  			   try {
	  				if(con!=null)con.close();
	  			} catch (SQLException e) {
	  				e.printStackTrace();
	  			}
	  		  }//end finally
	    	  return n;
		}//end insertDelete

}