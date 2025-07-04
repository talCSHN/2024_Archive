package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.userDTO;

public class userDAO {
	public List<userDTO> findAll(SqlSession session){
		List<userDTO> list = session.selectList("com.config.userMapper.findAll");
		return list;
	}
}
