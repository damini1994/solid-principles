package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public class StripeGateway implements PaymentProcessor, PaymentRefund, PaymentLinkGenerator, PaymentStatusChecker {
    @Override
    public void processPayment(double amount, String orderId, String paymentDetails) {
        System.out.println("Processing Stripe payment of $" + amount + " for order " + orderId + " with details: " + paymentDetails);
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
