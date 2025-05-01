package com.example.solid_principles.ISP.MultifunctionPrinter.Violation;

public class ISPPrinterViolation {
    public static void main(String[] args) {
        AllInOnePrinter aioPrinter = new AllInOnePrinter();
        aioPrinter.print();
        aioPrinter.scan();
        aioPrinter.fax();

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();
        try {
            simplePrinter.scan();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        try {
            simplePrinter.fax();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
