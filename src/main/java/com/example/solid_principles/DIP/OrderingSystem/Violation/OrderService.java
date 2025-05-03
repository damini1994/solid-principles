package com.example.solid_principles.DIP.OrderingSystem.Violation;

public class OrderService {
    private PayPalProcessor payPalProcessor;
    private StripeProcessor stripeProcessor;
    private String preferredProcessor;

    public OrderService(String preferredProcessor) {
        this.preferredProcessor = preferredProcessor;
        this.payPalProcessor = new PayPalProcessor();
        this.stripeProcessor = new StripeProcessor();
    }

    public void checkout(double amount, String paymentDetails) {
        if ("paypal".equalsIgnoreCase(preferredProcessor)) {
            payPalProcessor.processPayment(amount, paymentDetails);
        } else if ("stripe".equalsIgnoreCase(preferredProcessor)) {
            stripeProcessor.processPayment(amount, paymentDetails, "...", "...");
        } else {
            System.out.println("Unsupported payment processor: " + preferredProcessor);
        }
        System.out.println("Order processed successfully.");
    }
}
