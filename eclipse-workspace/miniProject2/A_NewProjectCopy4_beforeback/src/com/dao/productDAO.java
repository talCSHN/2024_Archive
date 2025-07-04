package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.productDTO;

public class productDAO {
	public List<productDTO> findAll(SqlSession session){
		List<productDTO> list = session.selectList("com.config.productMapper.findAll");
		return list;
	}
}
