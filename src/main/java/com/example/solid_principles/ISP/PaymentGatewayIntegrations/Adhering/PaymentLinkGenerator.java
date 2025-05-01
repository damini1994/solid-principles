package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public interface PaymentLinkGenerator {
    String generatePaymentLink(double amount, String description);
}
