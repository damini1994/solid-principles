package com.example.solid_principles.LSP.VehicleHierarchy.Adhering;

public class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is moving.");
    }
}
