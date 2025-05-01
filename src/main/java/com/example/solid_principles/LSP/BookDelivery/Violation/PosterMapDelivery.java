package com.example.solid_principles.LSP.BookDelivery.Violation;

public class PosterMapDelivery extends BookDelivery {
    @Override
    void getDeliveryLocations() {
        System.out.println("Available only at high-street shops.");
    }
}
