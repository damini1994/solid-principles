package com.example.solid_principles.OCP.PaymentProcessing.Adhering;

public class PaymentProcessor {
    public void process(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}
