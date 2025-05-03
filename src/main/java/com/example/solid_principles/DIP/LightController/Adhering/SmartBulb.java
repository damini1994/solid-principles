package com.example.solid_principles.DIP.LightController.Adhering;

public class SmartBulb  implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Smart bulb powered ON (with extra features).");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart bulb powered OFF.");
    }
}
