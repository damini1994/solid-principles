package com.example.solid_principles.LSP.BookDelivery.Violation;

public class AudioBookDelivery extends BookDelivery {
    @Override
    void getDeliveryLocations() {
        // Problem: No physical delivery possible
        throw new UnsupportedOperationException("Audiobooks can't be delivered to a location.");
    }
}
