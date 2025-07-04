package com.dto;

public class ProductDTO {
    private String productID;
    private String productName;
    private int price;
    private String category;
    private String descript;


    public ProductDTO() {
    }

    public ProductDTO(String productID, String productName, int price, String category, String descript) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.descript = descript;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }


}