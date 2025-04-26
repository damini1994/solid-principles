package com.example.solid_principles.SRP.SimpleExample.Adhering;

public class UserRepsitory {
    public void saveUser(User user){
        System.out.println("User: "+user.getName()+" saved to DB");
    }
}
