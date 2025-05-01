package com.example.solid_principles.ISP.PaymentGatewayIntegrations.Adhering;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        StripeGateway stripe = new StripeGateway();
        stripe.processPayment(100.00, "order123", "card details...");
        stripe.refundPayment("txn456", 50.00);
        System.out.println("Stripe Link: " + stripe.generatePaymentLink(75.00, "Test Payment"));
        System.out.println("Stripe Status: " + stripe.getTransactionStatus("txn456"));
        System.out.println();
        PayPalGateway paypal = new PayPalGateway();
        paypal.processPayment(50.00, "order789", "paypal account...");
        paypal.refundPayment("txn101", 25.00);
        System.out.println("PayPal Link: " + paypal.generatePaymentLink(30.00, "Subscription"));
        System.out.println("PayPal Status: " + paypal.getTransactionStatus("txn101"));
        System.out.println();
        SquareGateway square = new SquareGateway();
        square.processPayment(20.00, "orderabc", "card on file...");
        square.refundPayment("txnxyz", 10.00);
        System.out.println("Square Status: " + square.getTransactionStatus("txnxyz"));
        // square.generatePaymentLink(15.00, "Donation"); // Square doesn't implement this interface
    }

}
