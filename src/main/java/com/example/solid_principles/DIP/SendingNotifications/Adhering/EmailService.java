package com.example.solid_principles.DIP.SendingNotifications.Adhering;

public class EmailService implements NotificationChannel {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
