package com.example.solid_principles.LSP.BookDelivery.Adhering;

public class AudioBookDelivery  extends OnlineDelivery {
    @Override
    void getSoftwareOptions() {
        System.out.println("Audiobook available via Audible, Google Play, etc.");
    }
}
