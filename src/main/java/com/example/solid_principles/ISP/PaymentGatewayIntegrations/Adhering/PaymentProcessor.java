package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public interface PaymentProcessor {
    void processPayment(double amount, String orderId, String paymentDetails); // Abstracted details
}
