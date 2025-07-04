package com.dto;

public class salesDTO {
	int sale_id;
	int product_id;
	String sale_date;
	int quantity;
	int total_amount;
	int sum;
	
	public salesDTO() {}
	
	public salesDTO(int sale_id, int product_id, String sale_date, int quantity, int total_amount, int sum) {
		this.sale_id = sale_id;
		this.product_id = product_id;
		this.sale_date = sale_date;
		this.quantity = quantity;
		this.total_amount = total_amount;
		this.sum=sum;
	}
	public int getSale_id() {
		return sale_id;
	}
	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "salesDTO [sale_id=" + sale_id + ", product_id=" + product_id + ", sale_date=" + sale_date
				+ ", quantity=" + quantity + ", total_amount=" + total_amount + ", sum=" + sum + "]";
	}

}
