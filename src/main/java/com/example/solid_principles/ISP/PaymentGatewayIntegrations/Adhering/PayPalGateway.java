package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public class PayPalGateway implements PaymentProcessor, PaymentRefund, PaymentLinkGenerator, PaymentStatusChecker {
    @Override
    public void processPayment(double amount, String orderId, String paymentDetails) {
        System.out.println("Processing PayPal payment of $" + amount + " for order " + orderId + " with details: " + paymentDetails);
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        System.out.println("Refunding $" + amount + " via PayPal for transaction " + transactionId);
    }

    @Override
    public String generatePaymentLink(double amount, String description) {
        System.out.println("Generating PayPal payment link for $" + amount + " (" + description + ")");
        return "paypal.com/payment/link";
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Fetching PayPal status for transaction " + transactionId);
        return "COMPLETED";
    }
}
