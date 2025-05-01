package com.example.solid_principles.ISP.Worker.Adhering;

public class Manager implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Manager is managing.");
    }

    @Override
    public void eat() {
        System.out.println("Manager is eating during a meeting.");
    }
}
