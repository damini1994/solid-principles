package com.example.solid_principles.DIP.OrderingSystem.Adhering;

public class AmazonPayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount, String amazonId) {
        System.out.println("Amazon Pay: Processing payment of $" + amount + " with Amazon ID " + amazonId);
    }
}
