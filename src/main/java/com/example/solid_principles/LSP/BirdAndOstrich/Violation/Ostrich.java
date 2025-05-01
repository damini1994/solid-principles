package com.example.solid_principles.LSP.BirdAndOstrich.Violation;

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
