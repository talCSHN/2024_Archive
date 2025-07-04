package com.dto;

public class inventoryDTO {
	int product_id;
	int stock_amount;
	String last_updated;
	
	public inventoryDTO() {}
	
	public inventoryDTO(int product_id, int stock_amount, String last_updated) {
		this.product_id = product_id;
		this.stock_amount = stock_amount;
		this.last_updated = last_updated;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getStock_amount() {
		return stock_amount;
	}
	public void setStock_amount(int stock_amount) {
		this.stock_amount = stock_amount;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	
	@Override
	public String toString() {
		return "inventoryDTO [product_id=" + product_id + ", stock_amount=" + stock_amount + ", last_updated="
				+ last_updated + "]";
	}
	
}
