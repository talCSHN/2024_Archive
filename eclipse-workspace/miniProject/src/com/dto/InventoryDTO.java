package com.dto;

public class InventoryDTO {
    @Override
	public String toString() {
		return "InventoryDTO [inventoryID=" + inventoryID + ", productID=" + productID + ", quantity=" + quantity + "]";
	}

	private String inventoryID;
    private String productID;
    private int quantity;

    public InventoryDTO() {
    }

    public InventoryDTO(String inventoryID, String productID, int quantity) {
        this.inventoryID = inventoryID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public String getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(String inventoryID) {
        this.inventoryID = inventoryID;
    }


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}