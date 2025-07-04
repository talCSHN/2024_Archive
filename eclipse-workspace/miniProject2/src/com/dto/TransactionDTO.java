package com.dto;

public class TransactionDTO {

	
	@Override
	public String toString() {
		return "TransactionDTO [transactionDate=" + transactionDate + ", transactionID=" + transactionID + ", amount="
				+ amount + "]";
	}

	private String transactionID;
	private String transactionDate;
	private int amount;

	
	public TransactionDTO() {}  

	public TransactionDTO(String transactionID, String transactionDate, int amount) {
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.amount = amount;
		
	}

	public String getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	

}