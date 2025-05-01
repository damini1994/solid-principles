package com.example.solid_principles.ISP.Worker.Violation;

public class RobotWorker  implements Worker {
    @Override
    public void work() {
        System.out.println("Robot worker is working.");
    }

    @Override
    public void eat() {
        // Robots don't eat, but we are forced to implement this
        System.out.println("Robot worker does not eat.");
    }

    @Override
    public void rest() {
        // Robots might need maintenance, but 'rest' is not the right term
        System.out.println("Robot worker is undergoing maintenance.");
    }
}
