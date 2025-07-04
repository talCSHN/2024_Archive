package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.InventoryDTO;

public class InventoryDAO {

	public List<InventoryDTO> findAllInventory(SqlSession session){
		List<InventoryDTO> list = 
				session.selectList("com.config.InventoryMapper.findAllInventory");
		return list;
	}

	public int insertInventory(SqlSession session, InventoryDTO dto) {
		
		return session.insert("com.config.InventoryMapper.insertInventory", dto);
	}
	
	public int updateInventory(SqlSession session, InventoryDTO dto) {
		
		return session.update("com.config.InventoryMapper.updateInventory", dto);
	}
	
	public int removeByInventoryID(SqlSession session, String InventoryID) {
		return session.delete("com.config.InventoryMapper.removeByInventoryID", InventoryID);
	}
	
}