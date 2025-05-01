package com.example.solid_principles.OCP.PaymentProcessing.Adhering;

class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Processed PayPal payment of $" + amount + " via PayPal for " + email);
    }
}