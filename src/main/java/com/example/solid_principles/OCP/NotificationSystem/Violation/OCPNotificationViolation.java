package com.example.solid_principles.OCP.NotificationSystem.Violation;

public class OCPNotificationViolation {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier.sendSMS("Hello!", "123-456-7890");
        notifier.sendEmail("Hi!", "test@example.com");
    }

}
