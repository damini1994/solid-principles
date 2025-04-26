package com.example.solid_principles.SRP.OrderProcessing.Adhering;

public class SRPOrderCompliant {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order("customer@example.com");

        // Add items
        order.addItem(new OrderItem("Laptop", 1));
        order.addItem(new OrderItem("Mouse", 2));

        // Handle responsibilities
        OrderRepository repository = new OrderRepository();
        OrderConfirmationEmailSender emailSender = new OrderConfirmationEmailSender();

        repository.save(order);
        emailSender.sendConfirmation(order);
    }
}
