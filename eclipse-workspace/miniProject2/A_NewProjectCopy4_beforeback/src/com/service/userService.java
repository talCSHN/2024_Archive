package com.service;

import java.util.List;

import com.dao.userDAO;
import com.dto.userDTO;

public interface userService {
	public void setDao(userDAO dao);
	public List<userDTO> findAll();
}
