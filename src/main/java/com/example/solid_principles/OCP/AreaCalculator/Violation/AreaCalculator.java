package com.example.solid_principles.OCP.AreaCalculator.Violation;

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle rectangle) {
            return  rectangle.getWidth() * rectangle.getHeight();
        } else if (shape instanceof Circle circle) {
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        return 0;
    }
}
