package com.example.solid_principles.DIP.SendingNotifications.Violation;

public class SMSService {
    public void sendSMS(String message, String phoneNumber) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
