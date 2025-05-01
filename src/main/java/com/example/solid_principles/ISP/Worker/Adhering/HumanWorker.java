package com.example.solid_principles.ISP.Worker.Adhering;

public class HumanWorker  implements Workable, Eatable, Restable {
    @Override
    public void work() {
        System.out.println("Human worker is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human worker is eating.");
    }

    @Override
    public void rest() {
        System.out.println("Human worker is resting.");
    }
}
