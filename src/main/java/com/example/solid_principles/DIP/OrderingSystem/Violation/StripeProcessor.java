package com.example.solid_principles.DIP.OrderingSystem.Violation;

public class StripeProcessor {
    public void processPayment(double amount, String cardNumber, String expiry, String cvv) {
        System.out.println("Processing Stripe payment of $" + amount + " with card ****-****-****-" + cardNumber.substring(cardNumber.length() - 4));
    }
}
