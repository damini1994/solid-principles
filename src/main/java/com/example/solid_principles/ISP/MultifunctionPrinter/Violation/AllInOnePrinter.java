package com.example.solid_principles.ISP.MultifunctionPrinter.Violation;

public class AllInOnePrinter  implements MultifunctionDevice {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}
