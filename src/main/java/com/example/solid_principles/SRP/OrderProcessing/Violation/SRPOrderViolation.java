package com.example.solid_principles.SRP.OrderProcessing.Violation;

public class SRPOrderViolation {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order("customer@example.com");

        // Add items
        order.addItem(new OrderItem("Laptop", 1));
        order.addItem(new OrderItem("Mouse", 2));

        // This class is handling everything — bad!
        order.saveToDatabase();
        order.sendConfirmationEmail();
    }
}
