package com.example.solid_principles.DIP.OrderingSystem.Adhering;

public class OrderService {
    private PaymentProcessor paymentProcessor;

    // Inject the dependency through the constructor
    public OrderService(PaymentProcessor processor) {
        this.paymentProcessor = processor;
    }

    public void checkout(double amount, String paymentDetails) {
        paymentProcessor.processPayment(amount, paymentDetails);
        System.out.println("Order processed successfully.");
    }
}
