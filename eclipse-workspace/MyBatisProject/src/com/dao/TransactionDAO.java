package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.TransactionDTO;

public class TransactionDAO {

	public List<TransactionDTO> findAllTransaction(SqlSession session){
		List<TransactionDTO> list = 
				session.selectList("com.config.TransactionMapper.findAllTransaction");
		return list;
	}


	public int insertTransaction(SqlSession session, TransactionDTO dto) {
		
		return session.insert("com.config.TransactionMapper.insertTransaction", dto);
	}
	
	public int updateTransaction(SqlSession session, TransactionDTO dto) {
		
		return session.update("com.config.TransactionMapper.updateTransaction", dto);
	}
	
	public int removeByTransactionID(SqlSession session, String TransactionID) {
		return session.delete("com.config.TransactionMapper.removeByTransactionID", TransactionID);
	}
	
}