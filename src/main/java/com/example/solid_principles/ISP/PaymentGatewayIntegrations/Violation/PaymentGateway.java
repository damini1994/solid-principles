package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Violation;

public interface PaymentGateway {
    void processPayment(double amount, String orderId, String cardNumber, String expiry, String cvv);
    void refundPayment(String transactionId, double amount);
    String generatePaymentLink(double amount, String description);
    String getTransactionStatus(String transactionId);
}
