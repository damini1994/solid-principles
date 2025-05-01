package com.example.solid_principles.OCP.AreaCalculator.Adhering;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Rectangle rect = new Rectangle(5, 10);
        Circle circ = new Circle(7);
        Triangle tri = new Triangle(4, 6);

        System.out.println("Rectangle Area: " + calculator.calculateArea(rect));
        System.out.println("Circle Area: " + calculator.calculateArea(circ));
        System.out.println("Triangle Area: " + calculator.calculateArea(tri));
    }
}
