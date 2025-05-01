package com.example.solid_principles.OCP.PaymentProcessing.Adhering;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processed credit card payment of $" + amount + " using card " + cardNumber);
    }
}
