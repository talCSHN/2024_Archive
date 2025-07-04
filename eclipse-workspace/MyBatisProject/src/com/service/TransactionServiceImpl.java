package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.TransactionDAO;
import com.dto.TransactionDTO;

public class TransactionServiceImpl implements TransactionService {
   private TransactionDAO dao;
   public void setDao(TransactionDAO dao) {
      this.dao = dao;
   }
   @Override
   public List<TransactionDTO> findAllTransaction(){
      List<TransactionDTO> list = null;
      SqlSession session = null;
      try {
         session = MySqlSessionFactory.getSession();
         list = dao.findAllTransaction(session);
      }finally {
         session.close();
      }
      return list;
   }
   
   
   @Override
   public int insertTransaction(SqlSession session, TransactionDTO dto) {
	    int n = 0;
	    SqlSession session1 = null;
	    try {
	    	session1 = MySqlSessionFactory.getSession();
	        n = dao.insertTransaction(session1, dto);
	        session1.commit();
	    } catch (Exception e) {
	        session1.rollback();
	        e.printStackTrace();
	    } finally {
	        session1.close();
	    }
		
	    return n;
   }
   
   @Override
   public int updateTransaction(SqlSession session, TransactionDTO dto) {
	    int n = 0;
	    SqlSession session2 = null;
	    try {
	    	session2 = MySqlSessionFactory.getSession();
	        n = dao.updateTransaction(session2, dto);
	        session2.commit();
	    } catch (Exception e) {
	        session2.rollback();
	        e.printStackTrace();
	    } finally {
	        session2.close();
	    }
		
	    return n;
   }
   
   @Override
	public int removeByTransactionID(String TransactionID) {
		int n = 0;
		SqlSession session = null;
	      try {
			session = MySqlSessionFactory.getSession();
			//DAO 연동코드
			n = dao.removeByTransactionID(session, TransactionID);
			session.commit();
	      }finally {
			session.close();
	      }
		return n;
	}
   
}