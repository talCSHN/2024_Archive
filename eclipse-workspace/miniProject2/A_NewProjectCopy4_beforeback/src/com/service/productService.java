package com.service;

import java.util.List;

import com.dao.productDAO;
import com.dto.productDTO;

public interface productService {
	public void setDao(productDAO dao);
	public List<productDTO> findAll();
}
