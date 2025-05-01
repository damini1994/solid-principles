package com.example.solid_principles.ISP.Worker.Violation;

public class ISPViolationExample {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        human.rest();

        RobotWorker robot = new RobotWorker();
        robot.work();
        robot.eat(); // Unnecessary method
        robot.rest(); // Semantically incorrect method
    }
}
