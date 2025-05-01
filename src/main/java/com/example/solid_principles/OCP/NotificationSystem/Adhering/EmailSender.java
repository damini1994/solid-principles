package com.example.solid_principles.OCP.NotificationSystem.Adhering;

class EmailSender implements NotificationSender {
    @Override
    public void send(String message, String emailAddress) {
        // Logic to send email
        System.out.println("Email sent to " + emailAddress + ": " + message);
    }
}
