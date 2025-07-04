package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.UserProductDAO;
import com.dto.UserProductDTO;

public class UserProductServiceImpl implements UserProductService {
   private UserProductDAO dao;
   public void setDao(UserProductDAO dao) {
      this.dao = dao;
   }
   //조회
   @Override
   public List<UserProductDTO> findAllProduct(){
      List<UserProductDTO> list = null;
      SqlSession session = null;
      try {
         session = MySqlSessionFactory.getSession();
         list = dao.findAllProduct(session);
      }finally {
         session.close();
      }
      return list;
   }
   
   //검색
   @Override
   public List<UserProductDTO> findByProductName(String productName){
	      List<UserProductDTO> list = null;
	      SqlSession session = null;
	      try {
	         session = MySqlSessionFactory.getSession();
	         list = dao.findByProductName(session, productName);
	      }finally {
	    	 session.close();
	      }
	      return list;
	   }

}
   
   
   
