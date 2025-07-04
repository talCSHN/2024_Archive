package com.service;

import java.util.List;

import com.dao.UserTableDAO;
import com.dto.UserProductDTO;
import com.dto.UserTableDTO;


public interface UserTableService {
	public void setDao(UserTableDAO dao);
	   public List<UserTableDTO> findAllProduct();
	   public List<UserProductDTO> findByProductName(String productName);
}
