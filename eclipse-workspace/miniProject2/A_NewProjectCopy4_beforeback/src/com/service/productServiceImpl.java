package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.productDAO;
import com.dto.productDTO;

public class productServiceImpl implements productService {
	
	private productDAO dao;
	public void setDao(productDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<productDTO> findAll(){
		List<productDTO> list = null;
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
