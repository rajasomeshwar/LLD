package com.stock.entity;

public class Stock {
    private String productName;
    private int currentQuantity;
    public StockPublisher publisher;
    public Stock(String name, int quantity, StockPublisher publisher) {
        this.publisher = publisher;
        setName(name);
        setQuantity(quantity);
    }
    public void setName(String name) {
        this.productName = name;
    }
    public String getProductName() {
        return this.productName;
    }
    public void setQuantity(int quantity) {
        this.currentQuantity += quantity;
        if (this.currentQuantity == quantity && quantity > 0 ) {
            publisher.notify(this);
        }


    }
}
