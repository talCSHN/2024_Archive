package com.jdbc3;

import java.util.List;

//역할: - 메서드 강제, loosely coupling, 어떤 기능인지 쉽게 알 수 있다.
public interface DeptService {
	public List<DeptDTO> select();
}