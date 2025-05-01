package com.example.solid_principles.OCP.AreaCalculator.Adhering;

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
