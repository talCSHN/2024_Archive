package com.service;

import java.util.List;

import com.dao.salesDAO;
import com.dto.salesDTO;

public interface salesService {
	public void setDao(salesDAO dao);
	public List<salesDTO> findAll();
	public List<salesDTO> findTy();
	public List<salesDTO> findTm();
	public List<salesDTO> findTd();
}
