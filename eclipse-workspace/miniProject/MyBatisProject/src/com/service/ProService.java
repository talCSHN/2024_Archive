package com.service;

import java.util.List;

import com.dao.ProductDAO;
import com.dto.ProductDTO;

public interface ProService {
   public void setDao(ProductDAO dao);
   public List<ProductDTO> findProduct();
}