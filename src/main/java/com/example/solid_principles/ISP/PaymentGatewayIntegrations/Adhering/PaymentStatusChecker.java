package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public interface PaymentStatusChecker {
    String getTransactionStatus(String transactionId);
}
