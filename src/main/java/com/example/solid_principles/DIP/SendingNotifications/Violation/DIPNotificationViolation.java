package com.example.solid_principles.DIP.SendingNotifications.Violation;

public class DIPNotificationViolation {
    public static void main(String[] args) {
        NotificationService notifier = new NotificationService();
        notifier.send("Hello!", "user@example.com", "email");
        notifier.send("Hi!", "123-456-7890", "sms");

        // Adding a new notification channel (e.g., push) requires modifying NotificationService.
    }
}
