package com.example.solid_principles.LSP.RectangleAndSquare.Adhering;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}
