package com.example.solid_principles.OCP.DiscountCalculator.Adhering;

public class PremiumDiscount extends Discount {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}
