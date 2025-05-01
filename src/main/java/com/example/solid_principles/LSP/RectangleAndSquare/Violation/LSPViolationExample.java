package com.example.solid_principles.LSP.RectangleAndSquare.Violation;

public class LSPViolationExample {
    public static void main(String[] args) {
        Rectangle rect = new Square(); // Substituted with Square

        rect.setWidth(5);
        rect.setHeight(10);

        // Expected area = 5 * 10 = 50
        // Actual area = 10 * 10 = 100 due to overridden behavior
        System.out.println("Area = " + rect.getArea()); // ❌ Violates LSP
    }
}
