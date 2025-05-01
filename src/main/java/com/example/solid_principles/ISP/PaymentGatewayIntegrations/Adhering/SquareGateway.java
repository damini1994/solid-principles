package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public class SquareGateway implements PaymentProcessor, PaymentRefund, PaymentStatusChecker {
    @Override
    public void processPayment(double amount, String orderId, String paymentDetails) {
        System.out.println("Processing Square payment of $" + amount + " for order " + orderId + " with details: " + paymentDetails);
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        System.out.println("Refunding $" + amount + " via Square for transaction " + transactionId);
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Fetching Square status for transaction " + transactionId);
        return "PAID";
    }
}
