package com.jdbc4_DML3_트랜잭션;

import java.sql.Connection;
import java.util.List;

//역할: - 메서드 강제, loosely coupling, 어떤 기능인지 쉽게 알 수 있다.
public interface UserService {
	public List<UserDTO> select();
	public int insert(UserDTO dto)throws DuplicatedUserException;
	public int delete(String UserID);
	
	//트랜잭션처리
	public int insertDelete(UserDTO dto, String UserID)throws DuplicatedUserException;
}