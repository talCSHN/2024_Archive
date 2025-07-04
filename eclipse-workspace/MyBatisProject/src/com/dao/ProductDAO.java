package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ProductDTO;

public class ProductDAO {
   public List<ProductDTO>findProduct(SqlSession session){
      List<ProductDTO> list = session.selectList("com.config.mapper.findProduct");
      return list;
   }
}