package com.example.solid_principles.SRP.OrderProcessing.Adhering;

public class OrderConfirmationEmailSender {
    public void sendConfirmation(Order order) {
        // Simulate sending an email
        System.out.println("Sending confirmation email to " + order.getCustomerEmail());
        System.out.println("Email content: Thank you for your order of " + order.getItems().size() + " items!\n");
    }
}
