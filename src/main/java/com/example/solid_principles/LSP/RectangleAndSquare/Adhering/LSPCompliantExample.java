package com.example.solid_principles.LSP.RectangleAndSquare.Adhering;

public class LSPCompliantExample {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape square = new Square(10);

        System.out.println("Rectangle area = " + rect.getArea());
        System.out.println("Square area = " + square.getArea());
    }
}
