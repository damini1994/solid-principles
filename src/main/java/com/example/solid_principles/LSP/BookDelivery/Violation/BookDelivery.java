package com.example.solid_principles.LSP.BookDelivery.Violation;

public class BookDelivery {
    String title;
    Integer userID;

    void getDeliveryLocations() {
        System.out.println("Available at multiple physical locations.");
    }
}
