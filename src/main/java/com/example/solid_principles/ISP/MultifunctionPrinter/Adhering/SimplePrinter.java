package com.example.solid_principles.ISP.MultifunctionPrinter.Adhering;

public class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
