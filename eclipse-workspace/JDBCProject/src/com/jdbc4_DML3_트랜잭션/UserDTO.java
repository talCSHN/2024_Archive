package com.jdbc4_DML3_트랜잭션;

// 역할: dept 테이블의 레코드 저장
public class UserDTO {
	
	// 컬럼에 대응하는 변수
	String UserID;
	String UserName;
	String Email;
	String PhoneNumber;
	String UserSSN;
	
	public UserDTO() {}

	public UserDTO(String UserID, String UserName, String Email, String PhoneNumber, String UserSSN) {
		this.UserID = UserID;
		this.UserName = UserName;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.UserSSN = UserSSN;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String UserID) {
		this.UserID = UserID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	
	public String getUserSSN() {
		return UserSSN;
	}

	public void setUserSSN(String UserSSN) {
		this.UserSSN = UserSSN;
	}

	@Override
	public String toString() {
		return "UserDTO [UserID=" + UserID + ", UserName=" + UserName + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + ", UserSSN=" + UserSSN + "]";
	}
	
    
}