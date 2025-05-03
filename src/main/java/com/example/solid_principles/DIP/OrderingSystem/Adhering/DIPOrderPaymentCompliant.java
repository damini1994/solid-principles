package com.example.solid_principles.DIP.OrderingSystem.Adhering;

public class DIPOrderPaymentCompliant {
    public static void main(String[] args) {
        PaymentProcessor payPal = new PayPalProcessor();
        OrderService payPalOrder = new OrderService(payPal);
        payPalOrder.checkout(80.00, "paypal_user");
        System.out.println();

        PaymentProcessor stripe = new StripeProcessor();
        OrderService stripeOrder = new OrderService(stripe);
        stripeOrder.checkout(150.00, "4444-****-****-9876");
        System.out.println();

        PaymentProcessor amazonPay = new AmazonPayProcessor();
        OrderService amazonOrder = new OrderService(amazonPay);
        amazonOrder.checkout(55.00, "amazon_user_id");

        // Adding a new payment processor only requires creating a new class implementing
        // PaymentProcessor and injecting it into OrderService.
    }
}
