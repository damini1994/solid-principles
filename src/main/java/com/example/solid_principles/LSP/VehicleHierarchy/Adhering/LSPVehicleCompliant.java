package com.example.solid_principles.LSP.VehicleHierarchy.Adhering;

public class LSPVehicleCompliant {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.startEngine();

        Bicycle myBike = new Bicycle();
        myBike.move();
        // myBike.startEngine(); // Not applicable
    }
}
