package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Violation;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        StripeGateway stripe = new StripeGateway();
        stripe.generatePaymentLink(75.00, "Test Payment");

        PayPalGateway paypal = new PayPalGateway();
        paypal.generatePaymentLink(30.00, "Subscription");
        paypal.processPayment(50.00, "order789", "some card number", "expiry", "cvv"); // Might not be ideal

        SquareGateway square = new SquareGateway();
        try {
            square.generatePaymentLink(15.00, "Donation"); // This might throw an exception or not be meaningful
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}