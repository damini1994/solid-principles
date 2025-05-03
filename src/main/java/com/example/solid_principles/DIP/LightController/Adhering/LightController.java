package com.example.solid_principles.DIP.LightController.Adhering;

public class LightController {
    private Switchable device;

    // Inject the dependency through the constructor
    public LightController(Switchable device) {
        this.device = device;
    }

    public void operateSwitch(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
