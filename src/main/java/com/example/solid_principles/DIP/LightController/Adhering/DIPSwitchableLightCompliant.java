package com.example.solid_principles.DIP.LightController.Adhering;

public class DIPSwitchableLightCompliant {
    public static void main(String[] args) {
        Switchable electricBulb = new ElectricBulb();
        LightController electricController = new LightController(electricBulb);
        electricController.operateSwitch(true);
        electricController.operateSwitch(false);
        System.out.println();

        Switchable ledLight = new LEDLight();
        LightController ledController = new LightController(ledLight);
        ledController.operateSwitch(true);
        ledController.operateSwitch(false);
        System.out.println();

        Switchable smartBulb = new SmartBulb();
        LightController smartController = new LightController(smartBulb);
        smartController.operateSwitch(true);
        smartController.operateSwitch(false);
        System.out.println();

        Switchable halogenLamp = new HalogenLamp();
        LightController halogenController = new LightController(halogenLamp);
        halogenController.operateSwitch(true);
        halogenController.operateSwitch(false);

        // Adding a new type of switchable device (like HalogenLamp) only requires
        // creating a new class that implements the Switchable interface and passing
        // it to the LightController, without modifying LightController itself.
    }
}
