package com.example.solid_principles.OCP.NotificationSystem.Adhering;

class Notifier {
    private NotificationSender sender;

    public Notifier(NotificationSender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message, String recipient) {
        sender.send(message, recipient);
    }
}
