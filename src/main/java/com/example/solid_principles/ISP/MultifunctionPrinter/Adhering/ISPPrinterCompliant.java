package com.example.solid_principles.ISP.MultifunctionPrinter.Adhering;

public class ISPPrinterCompliant {
    public static void main(String[] args) {
        AllInOnePrinter aioPrinter = new AllInOnePrinter();
        aioPrinter.print();
        aioPrinter.scan();
        aioPrinter.fax();
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();
        // simplePrinter.scan(); // No scan method
        // simplePrinter.fax(); // No fax method
        ScannerDevice scanner = new ScannerDevice();
        scanner.scan();
    }
}
