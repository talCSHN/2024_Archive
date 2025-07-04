package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.salesDTO;

public class salesDAO {
	public List<salesDTO> findAll(SqlSession session){
		List<salesDTO> list = session.selectList("com.config.salesMapper.findAll");
		return list;	
	}
	public List<salesDTO> findTy(SqlSession session){
		List<salesDTO> list = session.selectList("com.config.salesMapper.findTy");
		return list;	
	}
	public List<salesDTO> findTm(SqlSession session){
		List<salesDTO> list = session.selectList("com.config.salesMapper.findTm");
		return list;	
	}
	public List<salesDTO> findTd(SqlSession session){
		List<salesDTO> list = session.selectList("com.config.salesMapper.findTd");
		return list;	
	}
}
