package com.example.solid_principles.LSP.BirdAndOstrich.Adhering;

public class LSPCompliantExample {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        Ostrich ostrich = new Ostrich();
        ostrich.walk();
    }

}
