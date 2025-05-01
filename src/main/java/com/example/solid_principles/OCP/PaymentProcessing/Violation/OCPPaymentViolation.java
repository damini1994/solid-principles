package com.example.solid_principles.OCP.PaymentProcessing.Violation;

public class OCPPaymentViolation {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processCreditCard(100.00, "...", "...", "...");
        processor.processPayPal(50.00, "user@paypal.com");
    }
}
