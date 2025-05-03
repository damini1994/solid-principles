package com.example.solid_principles.DIP.OrderingSystem.Violation;

public class PayPalProcessor {
    public void processPayment(double amount, String accountId) {
        System.out.println("Processing PayPal payment of $" + amount + " from account " + accountId);
    }
}
