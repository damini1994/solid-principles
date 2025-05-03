package com.example.solid_principles.DIP.OrderingSystem.Adhering;

public class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount, String cardNumber) {
        System.out.println("Stripe: Processing payment of $" + amount + " with card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
