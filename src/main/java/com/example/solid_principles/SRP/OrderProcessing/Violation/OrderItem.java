package com.example.solid_principles.SRP.OrderProcessing.Violation;

public class OrderItem {
    private String productName;
    private int quantity;

    public OrderItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
