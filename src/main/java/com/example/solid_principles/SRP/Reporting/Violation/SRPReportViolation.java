package com.example.solid_principles.SRP.Reporting.Violation;

import java.util.ArrayList;

public class SRPReportViolation {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.fetchData();
        generator.generatePDF(new ArrayList<>());
        generator.generateCSV(new ArrayList<>());
    }
}
