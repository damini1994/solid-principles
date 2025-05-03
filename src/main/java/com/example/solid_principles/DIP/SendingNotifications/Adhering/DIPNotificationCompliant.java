package com.example.solid_principles.DIP.SendingNotifications.Adhering;

public class DIPNotificationCompliant {
    public static void main(String[] args) {
        NotificationChannel emailChannel = new EmailService();
        NotificationService emailNotifier = new NotificationService(emailChannel);
        emailNotifier.send("Welcome!", "newuser@example.com");

        NotificationChannel smsChannel = new SMSService();
        NotificationService smsNotifier = new NotificationService(smsChannel);
        smsNotifier.send("Your code is 1234", "987-654-3210");

        NotificationChannel pushChannel = new PushNotificationService();
        NotificationService pushNotifier = new NotificationService(pushChannel);
        pushNotifier.send("New message arrived!", "device_abc_123");

        // Adding a new notification channel only requires creating a new class implementing
        // NotificationChannel and injecting it into NotificationService.
    }
}
