package com.example.solid_principles.OCP.PaymentProcessing.Adhering;

public class OCPPaymentCompliant {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCardPayment("...", "...", "...");
        processor.process(creditCard, 100.00);

        PaymentMethod paypal = new PayPalPayment("user@paypal.com");
        processor.process(paypal, 50.00);

    }
}
