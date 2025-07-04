package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.inventoryDAO;
import com.dto.inventoryDTO;

public class inventoryServiceImpl implements inventoryService {
	private inventoryDAO dao;
	public void setDao(inventoryDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<inventoryDTO> findAll(){
		List<inventoryDTO> list = null;
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getSession();
			list = dao.findAll(session);
		}finally {
			session.close();
		}
		return list;
	}
}
