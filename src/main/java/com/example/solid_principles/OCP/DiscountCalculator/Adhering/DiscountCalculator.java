package com.example.solid_principles.OCP.DiscountCalculator.Adhering;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}
