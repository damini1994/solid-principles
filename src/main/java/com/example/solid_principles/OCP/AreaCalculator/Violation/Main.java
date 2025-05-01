package com.example.solid_principles.OCP.AreaCalculator.Violation;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Rectangle rectangle = new Rectangle(12, 13);
        Circle circle = new Circle(5);

        System.out.println("Rectangle Area: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + areaCalculator.calculateArea(circle));

    }
}
