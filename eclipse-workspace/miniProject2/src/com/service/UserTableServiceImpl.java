package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.UserTableDAO;
import com.dto.UserTableDTO;

public class UserTableServiceImpl implements UserTableService {
   private UserTableDAO dao;
   public void setDao(UserTableDAO dao) {
      this.dao = dao;
   }
   @Override
   public List<UserTableDTO> findAllProduct(){
      List<UserTableDTO> list = null;
      SqlSession session = null;
      try {
         session = MySqlSessionFactory.getSession();
         list = dao.findAllProduct(session);
      }finally {
         session.close();
      }
      return list;
   }
   
   
   
   
   
}