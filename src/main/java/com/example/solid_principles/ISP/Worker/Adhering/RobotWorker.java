package com.example.solid_principles.ISP.Worker.Adhering;

public class RobotWorker  implements Workable {
    @Override
    public void work() {
        System.out.println("Robot worker is working.");
    }
}
