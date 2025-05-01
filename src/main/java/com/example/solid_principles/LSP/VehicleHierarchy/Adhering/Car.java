package com.example.solid_principles.LSP.VehicleHierarchy.Adhering;

public class Car implements EngineVehicle {
    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}
