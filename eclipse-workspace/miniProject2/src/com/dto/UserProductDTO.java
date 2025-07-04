package com.dto;

public class UserProductDTO {
    
    private String product_name;
    private int price;
    private String description;
    private int stock;

    @Override
	public String toString() {
		return " [상품 이름] = " + product_name + " \t[가격] =" + price
				+ " \t\t[상품 상세] = " + description + " \t\t[재고 수량] = " + stock + "\n";
	}

	// Getters

    public String getProductName() {
        return product_name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    
    public int getStock() {
		return stock;
	}

    // Setters

    public void setProductName(String productName) {
        this.product_name = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	
	public void setStock(int stock) {
		this.stock = stock;
	}
}