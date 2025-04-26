package com.example.solid_principles.SRP.SimpleExample.Violation;

public class SRPViolationExample {
    public static void main(String[] args) {
        User user = new User("Damini", "damini@example.com");
        user.saveUser();
        user.sendEmail("Welcome");
    }
}
