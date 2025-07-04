package com.jdbc4_DML3_트랜잭션;

public class DuplicatedUserException extends Exception {

	public DuplicatedUserException(String message) {
		super(message);
	}

}