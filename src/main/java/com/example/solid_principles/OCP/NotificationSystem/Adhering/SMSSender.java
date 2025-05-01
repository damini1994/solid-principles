package com.example.solid_principles.OCP.NotificationSystem.Adhering;

class SMSSender implements NotificationSender {
    @Override
    public void send(String message, String phoneNumber) {
        // Logic to send SMS
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
