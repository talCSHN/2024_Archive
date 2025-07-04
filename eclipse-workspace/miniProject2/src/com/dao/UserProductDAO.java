package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.UserProductDTO;

public class UserProductDAO {
   public List<UserProductDTO> findAllProduct(SqlSession session){
      List<UserProductDTO> list = session.selectList("com.config.UserProductMapper.findAllProduct");
      return list;
   }
   
   public List<UserProductDTO> findByProductName(SqlSession session, String productName) {
	   List<UserProductDTO> list = session.selectList("com.config.UserProductMapper.findByProductName", productName);
	   return list;
	}
   
   
}