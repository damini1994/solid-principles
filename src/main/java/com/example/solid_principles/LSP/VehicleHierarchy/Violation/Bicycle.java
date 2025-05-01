package com.example.solid_principles.LSP.VehicleHierarchy.Violation;

public class Bicycle extends Vehicle {
    @Override
    public void startEngine() {
        // A bicycle doesn't have an engine, this doesn't make sense
        throw new UnsupportedOperationException("Bicycles don't have engines.");
    }
}
