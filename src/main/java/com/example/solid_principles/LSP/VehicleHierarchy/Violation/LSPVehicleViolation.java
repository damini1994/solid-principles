package com.example.solid_principles.LSP.VehicleHierarchy.Violation;

public class LSPVehicleViolation {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();

        Vehicle bicycle = new Bicycle();
        // This will throw an exception, indicating LSP violation
         bicycle.startEngine();
    }
}
