package com.example.solid_principles.SRP.SimpleExample.Violation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String email;

    public void saveUser(){
        System.out.println("User saved to DB");
    }

    public void sendEmail(String message){
        System.out.println("Email sent to: "+email+ " with message: "+message);
    }
}
