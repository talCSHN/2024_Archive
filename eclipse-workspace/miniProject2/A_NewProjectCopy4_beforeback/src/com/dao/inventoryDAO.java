package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.inventoryDTO;

public class inventoryDAO {
	public List<inventoryDTO> findAll(SqlSession session){
		List<inventoryDTO> list = session.selectList("com.config.inventoryMapper.findAll");
		return list;
	}
}
