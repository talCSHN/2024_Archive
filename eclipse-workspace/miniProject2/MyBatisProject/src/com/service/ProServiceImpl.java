package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ProductDAO;
import com.dto.ProductDTO;

public class ProServiceImpl implements ProService {

   private ProductDAO dao;
   @Override
   public void setDao(ProductDAO dao) {
      this.dao = dao;
   }

   @Override
   public List<ProductDTO> findProduct() {
      List<ProductDTO> list = null;
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
