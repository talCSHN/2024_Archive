package com.dto;

public class productDTO {
	
	int product_id;
	String product_name;
	int price;
	String description;
	int stock;
	
	public productDTO() {}

	public productDTO(int product_id, String product_name, int price, String description, int stock) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.description = description;
		this.stock = stock;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "productDTO [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price
				+ ", description=" + description + ", stock=" + stock + "]";
	}
	
}
