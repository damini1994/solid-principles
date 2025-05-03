package com.example.solid_principles.DIP.SendingNotifications.Adhering;

public interface NotificationChannel {
    void send(String message, String recipient);
}
