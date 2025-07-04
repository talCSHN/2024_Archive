package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.TransactionDAO;
import com.dto.TransactionDTO;


public interface TransactionService {
	public void setDao(TransactionDAO dao);
	   public List<TransactionDTO> findAllTransaction();
	   public int insertTransaction(SqlSession session, TransactionDTO dto);
	   public int updateTransaction(SqlSession session, TransactionDTO dto);
	   public int removeByTransactionID(String TransactionID);
}
