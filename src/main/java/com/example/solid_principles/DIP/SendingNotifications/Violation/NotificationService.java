package com.example.solid_principles.DIP.SendingNotifications.Violation;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void send(String message, String recipient, String channel) {
        if ("email".equalsIgnoreCase(channel)) {
            emailService.sendEmail(message, recipient);
        } else if ("sms".equalsIgnoreCase(channel)) {
            smsService.sendSMS(message, recipient);
        } else {
            System.out.println("Unsupported notification channel: " + channel);
        }
    }

}
