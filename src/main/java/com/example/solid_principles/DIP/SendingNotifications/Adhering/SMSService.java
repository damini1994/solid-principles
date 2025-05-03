package com.example.solid_principles.DIP.SendingNotifications.Adhering;

public class SMSService implements NotificationChannel {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
