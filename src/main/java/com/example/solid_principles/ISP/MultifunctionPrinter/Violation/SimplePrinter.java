package com.example.solid_principles.ISP.MultifunctionPrinter.Violation;

public class SimplePrinter  implements MultifunctionDevice {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        // Simple printer cannot scan, but we have to implement this
        throw new UnsupportedOperationException("Scanning not supported.");
    }

    @Override
    public void fax() {
        // Simple printer cannot fax, but we have to implement this
        throw new UnsupportedOperationException("Faxing not supported.");
    }

}
