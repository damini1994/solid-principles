package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public interface PaymentRefund {
    void refundPayment(String transactionId, double amount);
}
