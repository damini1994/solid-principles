package com.example.solid_principles.OCP.NotificationSystem.Adhering;

public class OCPNotificationCompliant {
    public static void main(String[] args) {
        NotificationSender smsSender = new SMSSender();
        Notifier smsNotifier = new Notifier(smsSender);
        smsNotifier.sendNotification("Hello!", "123-456-7890");

        NotificationSender emailSender = new EmailSender();
        Notifier emailNotifier = new Notifier(emailSender);
        emailNotifier.sendNotification("Hi!", "test@example.com");

    }
}
