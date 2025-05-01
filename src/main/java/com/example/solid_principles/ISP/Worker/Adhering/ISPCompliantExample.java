package com.example.solid_principles.ISP.Worker.Adhering;

public class ISPCompliantExample {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        human.rest();

        RobotWorker robot = new RobotWorker();
        robot.work();

        Manager manager = new Manager();
        manager.work();
        manager.eat();
    }
}
