package com.example.solid_principles.OCP.PaymentProcessing.Violation;

public class PaymentProcessor {
    public void processCreditCard(double amount, String cardNumber, String expiryDate, String cvv) {
        // Logic to process credit card payment
        System.out.println("Processed credit card payment of $" + amount);
    }

    // To add PayPal, we modify this class
    public void processPayPal(double amount, String email) {
        // Logic to process PayPal payment
        System.out.println("Processed PayPal payment of $" + amount + " for " + email);
    }
}
