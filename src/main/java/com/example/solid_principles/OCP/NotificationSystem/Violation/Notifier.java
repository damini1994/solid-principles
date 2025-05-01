package com.example.solid_principles.OCP.NotificationSystem.Violation;

class Notifier {
    public void sendSMS(String message, String phoneNumber) {
        // Logic to send SMS
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }

    // If we need to add email, we modify this class
    public void sendEmail(String message, String emailAddress) {
        // Logic to send email
        System.out.println("Email sent to " + emailAddress + ": " + message);
    }
}
