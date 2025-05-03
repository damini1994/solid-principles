package com.example.solid_principles.DIP.LightController.Adhering;

public class LEDLight implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LED light enabled.");
    }

    @Override
    public void turnOff() {
        System.out.println("LED light disabled.");
    }
}
