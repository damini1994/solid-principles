package com.example.solid_principles.DIP.OrderingSystem.Adhering;

public class PayPalProcessor  implements PaymentProcessor {
    @Override
    public void processPayment(double amount, String accountId) {
        System.out.println("PayPal: Processing payment of $" + amount + " from account " + accountId);
    }
}
