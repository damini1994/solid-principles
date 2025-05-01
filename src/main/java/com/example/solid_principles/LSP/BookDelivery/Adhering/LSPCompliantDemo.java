package com.example.solid_principles.LSP.BookDelivery.Adhering;

public class LSPCompliantDemo {
    public static void main(String[] args) {
        OfflineDelivery poster = new PosterMapDelivery();
        poster.getDeliveryLocations(); // ✅ Safe substitution

        OnlineDelivery audio = new AudioBookDelivery();
        audio.getSoftwareOptions(); // ✅ Safe substitution
    }
}
