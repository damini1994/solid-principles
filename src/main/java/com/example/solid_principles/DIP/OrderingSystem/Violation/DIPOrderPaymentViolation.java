package com.example.solid_principles.DIP.OrderingSystem.Violation;

public class DIPOrderPaymentViolation {
    public static void main(String[] args) {
        OrderService payPalOrder = new OrderService("paypal");
        payPalOrder.checkout(75.00, "user123");

        OrderService stripeOrder = new OrderService("stripe");
        stripeOrder.checkout(120.00, "5555-****-****-1234");

        // Adding a new payment processor requires modifying OrderService.
    }
}
