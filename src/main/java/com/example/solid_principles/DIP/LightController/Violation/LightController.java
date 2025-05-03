package com.example.solid_principles.DIP.LightController.Violation;

public class LightController {
    private ElectricBulb bulb;
    private LEDLight led;
    private SmartBulb smartBulb;
    private String currentLightType;

    public LightController(String lightType) {
        this.currentLightType = lightType;
        if ("electric".equalsIgnoreCase(lightType)) {
            this.bulb = new ElectricBulb();
            this.led = null;
            this.smartBulb = null;
        } else if ("led".equalsIgnoreCase(lightType)) {
            this.bulb = null;
            this.led = new LEDLight();
            this.smartBulb = null;
        } else if ("smart".equalsIgnoreCase(lightType)) {
            this.bulb = null;
            this.led = null;
            this.smartBulb = new SmartBulb();
        } else {
            throw new IllegalArgumentException("Unsupported light type.");
        }
    }

    public void turnOn() {
        if (bulb != null) {
            bulb.turnOn();
        } else if (led != null) {
            led.enable();
        } else if (smartBulb != null) {
            smartBulb.powerOn();
        } else {
            System.out.println("No light to turn on.");
        }
    }

    public void turnOff() {
        if (bulb != null) {
            bulb.turnOff();
        } else if (led != null) {
            led.disable();
        } else if (smartBulb != null) {
            smartBulb.powerOff();
        } else {
            System.out.println("No light to turn off.");
        }
    }
}