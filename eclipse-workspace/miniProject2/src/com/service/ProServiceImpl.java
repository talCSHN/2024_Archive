package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.UserProductDAO;
import com.dto.UserProductDTO;

public class ProServiceImpl implements ProService {

   private UserProductDAO dao;
   @Override
   public void setDao(UserProductDAO dao) {
      this.dao = dao;
   }

   @Override
   public List<UserProductDTO> findProduct() {
      List<UserProductDTO> list = null;
      SqlSession session = null;
      try {
         session = MySqlSessionFactory.getSession();
         list = dao.findProduct(session);
         session.commit();
         
      }finally {
         session.close();
      }
      return list;
   }

}
