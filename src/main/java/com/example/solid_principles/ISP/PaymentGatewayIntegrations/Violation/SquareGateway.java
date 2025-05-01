package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Violation;

public class SquareGateway  implements PaymentGateway {
    @Override
    public void processPayment(double amount, String orderId, String cardNumber, String expiry, String cvv) {
        System.out.println("Processing Square payment of $" + amount + " for order " + orderId);
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        System.out.println("Refunding $" + amount + " via Square for transaction " + transactionId);
    }

    @Override
    public String generatePaymentLink(double amount, String description) {
        // Square might not directly support generating payment links this way
        throw new UnsupportedOperationException("Square does not directly support generating payment links.");
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Fetching Square status for transaction " + transactionId);
        return "PAID";
    }
}
