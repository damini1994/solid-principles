package com.example.solid_principles.DIP.LightController.Adhering;

public class ElectricBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Electric bulb turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Electric bulb turned OFF.");
    }
}
