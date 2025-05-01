package com.example.solid_principles.LSP.BookDelivery.Adhering;

public class OfflineDelivery extends BookDelivery {
    void getDeliveryLocations() {
        System.out.println("Default offline delivery location.");
    }
}
