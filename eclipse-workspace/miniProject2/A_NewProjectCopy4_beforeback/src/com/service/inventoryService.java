package com.service;

import java.util.List;

import com.dao.inventoryDAO;
import com.dto.inventoryDTO;

public interface inventoryService {
	public void setDao(inventoryDAO dao);
	public List<inventoryDTO> findAll();
}
