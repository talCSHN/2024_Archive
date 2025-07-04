package com.service;

import java.util.List;

import com.dao.UserProductDAO;
import com.dto.UserProductDTO;


public interface UserProductService {
	public void setDao(UserProductDAO dao);
	   public List<UserProductDTO> findAllProduct();
	   public List<UserProductDTO> findByProductName(String productName);
	
}
