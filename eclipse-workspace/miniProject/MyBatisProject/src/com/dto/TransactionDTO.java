package com.dto;

public class TransactionDTO {

	
	private String TransactionDate;
	private String TransactionID;
	private int Amout;

	
	public TransactionDTO() {}  

	public TransactionDTO(String TransactionID, String TransactionDate, int Amout) {
		this.TransactionID = TransactionID;
		this.TransactionDate = TransactionDate;
		this.Amout = Amout;
		
	}

	public String getTransactionID() {
		return TransactionID;
	}


	public String setTransactionID() {
		return TransactionID;
	}
	
	public String getTransactionDate() {
		return TransactionDate;
	}

	public String setTransactionDate() {
		return TransactionID;
	}

	public int getAmout() {
		return Amout;
	}
	
	public String setgetAmout() {
		return TransactionID;
	}
	

}