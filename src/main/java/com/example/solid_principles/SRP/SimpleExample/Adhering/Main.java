package com.example.solid_principles.SRP.SimpleExample.Adhering;

public class Main {
    public static void main(String[] args) {
        User user = new User("Damini", "damini@rxample.com");
        UserRepsitory userRepsitory = new UserRepsitory();
        EmailService emailService = new EmailService();

        userRepsitory.saveUser(user);
        emailService.sendEmail(user, "Your account has been created");
    }
}
