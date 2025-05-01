package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Violation;

public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount, String orderId, String cardNumber, String expiry, String cvv) {
        System.out.println("Processing Stripe payment of $" + amount + " for order " + orderId);
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        System.out.println("Refunding $" + amount + " via Stripe for transaction " + transactionId);
    }

    @Override
    public String generatePaymentLink(double amount, String description) {
        System.out.println("Generating Stripe payment link for $" + amount + " (" + description + ")");
        return "stripe.com/payment/link";
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Fetching Stripe status for transaction " + transactionId);
        return "SUCCESS";
    }
}
