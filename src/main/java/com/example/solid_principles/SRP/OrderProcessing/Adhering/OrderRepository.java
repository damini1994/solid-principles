package com.example.solid_principles.SRP.OrderProcessing.Adhering;

public class OrderRepository {
    public void save(Order order) {
        // Simulate saving to a database
        System.out.println("Saving order for: " + order.getCustomerEmail());
        for (OrderItem item : order.getItems()) {
            System.out.println("Saving item: " + item.getProductName() + ", Quantity: " + item.getQuantity());
        }
        System.out.println("Order successfully saved to database!\n");
    }
}
