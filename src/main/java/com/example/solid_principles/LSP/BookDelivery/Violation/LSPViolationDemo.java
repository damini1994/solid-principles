package com.example.solid_principles.LSP.BookDelivery.Violation;

public class LSPViolationDemo {
    public static void main(String[] args) {
        BookDelivery poster = new PosterMapDelivery();
        poster.getDeliveryLocations();

        BookDelivery audio = new AudioBookDelivery();
        audio.getDeliveryLocations(); // This will throw exception at runtime — LSP violation!
    }
}
