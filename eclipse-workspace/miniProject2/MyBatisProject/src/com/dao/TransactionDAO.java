package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.UserDTO;

public class TransactionDAO {

	public List<UserDTO> findAll(SqlSession session){
		List<UserDTO> list = 
				session.selectList("com.config.EmpMapper.findAll");
		return list;
	}
	//save
	public int save(SqlSession session, UserDTO dto) {
		
		return 0;
	}
	//remove
	public int removeByEmpno(SqlSession session, int empno) {
		return session.delete("com.config.EmpMapper.removeByEmpno", empno);
	}
}