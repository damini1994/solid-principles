package com.example.solid_principles.DIP.SendingNotifications.Violation;

public class EmailService {
    public void sendEmail(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
