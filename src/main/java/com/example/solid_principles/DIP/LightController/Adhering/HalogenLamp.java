package com.example.solid_principles.DIP.LightController.Adhering;

public class HalogenLamp implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Halogen lamp ignited.");
    }

    @Override
    public void turnOff() {
        System.out.println("Halogen lamp extinguished.");
    }
}
