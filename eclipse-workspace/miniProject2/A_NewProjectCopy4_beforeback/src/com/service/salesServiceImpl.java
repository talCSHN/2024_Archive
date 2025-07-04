package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.salesDAO;
import com.dto.salesDTO;

public class salesServiceImpl implements salesService {
	private salesDAO dao;
	public void setDao(salesDAO dao) {
		this.dao = dao;
	}
	@Override
	public List<salesDTO> findAll(){
		List<salesDTO> list = null;
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getSession();
			list = dao.findAll(session);
		}finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<salesDTO> findTy(){
		List<salesDTO> list = null;
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getSession();
			list = dao.findTy(session);
		}finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<salesDTO> findTm(){
		List<salesDTO> list = null;
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getSession();
			list = dao.findTm(session);
		}finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<salesDTO> findTd(){
		List<salesDTO> list = null;
		SqlSession session = null;
		try {
			session = MySqlSessionFactory.getSession();
			list = dao.findTd(session);
		}finally {
			session.close();
		}
		return list;
	}

}
