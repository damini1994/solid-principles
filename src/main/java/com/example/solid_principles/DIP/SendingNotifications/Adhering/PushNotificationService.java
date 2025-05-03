package com.example.solid_principles.DIP.SendingNotifications.Adhering;

public class PushNotificationService implements NotificationChannel {
    @Override
    public void send(String message, String deviceToken) {
        System.out.println("Sending push notification to device: " + deviceToken + " with message: " + message);
    }
}
