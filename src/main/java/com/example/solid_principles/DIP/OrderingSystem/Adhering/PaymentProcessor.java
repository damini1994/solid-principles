package com.example.solid_principles.DIP.OrderingSystem.Adhering;

public interface PaymentProcessor {
    void processPayment(double amount, String paymentInfo);
}
