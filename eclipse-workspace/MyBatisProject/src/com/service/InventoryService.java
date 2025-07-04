package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.InventoryDAO;
import com.dto.InventoryDTO;


public interface InventoryService {
	public void setDao(InventoryDAO dao);
	   public List<InventoryDTO> findAllInventory();   
	   public int insertInventory(SqlSession session, InventoryDTO dto);
	   public int updateInventory(SqlSession session, InventoryDTO dto);
	   public int removeByInventoryID(String InventoryID);
}
