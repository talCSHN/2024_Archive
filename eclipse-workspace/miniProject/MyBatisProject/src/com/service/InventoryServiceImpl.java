package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.InventoryDAO;
import com.dto.InventoryDTO;

public class InventoryServiceImpl implements InventoryService {
   private InventoryDAO dao;
   public void setDao(InventoryDAO dao) {
      this.dao = dao;
   }
   @Override
   public List<InventoryDTO> findAllInventory(){
      List<InventoryDTO> list = null;
      SqlSession session = null;
      try {
         session = MySqlSessionFactory.getSession();
         list = dao.findAllInventory(session);
      }finally {
         session.close();
      }
      return list;
   }
   @Override
   public int insertInventory(SqlSession session, InventoryDTO dto) {
	    int n = 0;
	    SqlSession session1 = null;
	    try {
	    	session1 = MySqlSessionFactory.getSession();
	        n = dao.insertInventory(session1, dto);
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
   public int updateInventory(SqlSession session, InventoryDTO dto) {
	    int n = 0;
	    SqlSession session2 = null;
	    try {
	    	session2 = MySqlSessionFactory.getSession();
	        n = dao.updateInventory(session2, dto);
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
	public int removeByInventoryID(String InventoryID) {
		int n = 0;
		SqlSession session = null;
	      try {
			session = MySqlSessionFactory.getSession();
			//DAO 연동코드
			n = dao.removeByInventoryID(session, InventoryID);
			session.commit();
	      }finally {
			session.close();
	      }
		return n;
	}
   
}