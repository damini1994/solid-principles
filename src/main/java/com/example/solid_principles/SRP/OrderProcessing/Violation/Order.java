package com.example.solid_principles.SRP.OrderProcessing.Violation;

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

    // Saving to database - should NOT be here
    public void saveToDatabase() {
        // Simulate saving to database
        System.out.println("Saving order for: " + customerEmail);
        for (OrderItem item : items) {
            System.out.println("Saving item: " + item.getProductName() + ", Quantity: " + item.getQuantity());
        }
        System.out.println("Order successfully saved to database!\n");
    }

    // Sending email - should NOT be here
    public void sendConfirmationEmail() {
        // Simulate sending email
        System.out.println("Sending confirmation email to " + customerEmail);
        System.out.println("Email content: Thank you for your order of " + items.size() + " items!\n");
    }
}
