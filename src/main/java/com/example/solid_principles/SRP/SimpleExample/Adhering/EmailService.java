package com.example.solid_principles.SRP.SimpleExample.Adhering;


public class EmailService {
    public void sendEmail(User user, String message){
        System.out.println("Email sent to: "+user.getEmail()+ " with message: "+message);
    }
}
