package com.example.solid_principles.LSP.BirdAndOstrich.Violation;

public class LSPViolationExample {
    public static void main(String[] args) {
        Bird bird = new Ostrich(); // Looks valid, but breaks at runtime
        bird.fly(); // ❌ Will throw exception
    }
}
