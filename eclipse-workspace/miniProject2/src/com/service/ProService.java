package com.service;

import java.util.List;

import com.dao.UserProductDAO;
import com.dto.UserProductDTO;

public interface ProService {
   public void setDao(UserProductDAO dao);
   public List<UserProductDTO> findProduct();
}