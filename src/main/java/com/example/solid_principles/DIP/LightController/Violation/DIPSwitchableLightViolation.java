package com.example.solid_principles.DIP.LightController.Violation;

public class DIPSwitchableLightViolation {
    public static void main(String[] args) {
        LightController electricController = new LightController("electric");
        electricController.turnOn();
        electricController.turnOff();

        LightController ledController = new LightController("led");
        ledController.turnOn();
        ledController.turnOff();

        LightController smartController = new LightController("smart");
        smartController.turnOn();
        smartController.turnOff();

        // Adding a new type of light requires modifying LightController.
    }
}
