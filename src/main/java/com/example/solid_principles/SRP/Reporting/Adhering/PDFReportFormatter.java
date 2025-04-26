package com.example.solid_principles.SRP.Reporting.Adhering;

import java.util.List;

public class PDFReportFormatter implements ReportFormatter{
    @Override
    public void generate(List<Object> data) {
        // Logic to generate a PDF report
        System.out.println("PDF report generated.");
    }
}
