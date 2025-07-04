package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.userDAO;
import com.dto.userDTO;

public class userServiceImpl implements userService {
	
	private userDAO dao;
	public void setDao(userDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<userDTO> findAll(){
		List<userDTO> list = null;
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
