package com.example.solid_principles.ISP.MultifunctionPrinter.Adhering;

public class ScannerDevice  implements Scanner {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
