package com.example.solid_principles.DIP.SendingNotifications.Adhering;

public class NotificationService {
    private NotificationChannel notificationChannel;

    // Inject the dependency through the constructor
    public NotificationService(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void send(String message, String recipient) {
        notificationChannel.send(message, recipient);
    }
}
