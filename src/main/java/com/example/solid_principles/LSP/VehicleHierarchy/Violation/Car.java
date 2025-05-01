package com.example.solid_principles.LSP.VehicleHierarchy.Violation;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}
