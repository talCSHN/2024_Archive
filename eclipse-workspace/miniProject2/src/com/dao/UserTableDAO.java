package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.UserTableDTO;

public class UserTableDAO {
	
	public List<UserTableDTO> findCreatedAt(SqlSession session){
		List<UserTableDTO> list = 
				session.selectList("com.config.UserTableMapper.findCreatedAt");
		return list;
	}

	public int CreateUserId(SqlSession session, UserTableDTO dto) {
		return session.insert("com.config.UserTableMapper.CreateUserId", dto);
	}
	

	
}