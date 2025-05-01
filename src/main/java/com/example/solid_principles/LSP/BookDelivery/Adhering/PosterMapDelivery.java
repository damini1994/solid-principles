package com.example.solid_principles.LSP.BookDelivery.Adhering;

public class PosterMapDelivery extends OfflineDelivery {
    @Override
    void getDeliveryLocations() {
        System.out.println("Poster map available at high-street shops.");
    }
}
