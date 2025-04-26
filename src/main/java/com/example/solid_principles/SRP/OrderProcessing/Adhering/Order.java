package com.example.solid_principles.SRP.OrderProcessing.Adhering;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();
    private String customerEmail;

    public Order(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
