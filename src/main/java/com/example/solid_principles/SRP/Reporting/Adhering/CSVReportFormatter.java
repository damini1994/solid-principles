package com.example.solid_principles.SRP.Reporting.Adhering;

import java.util.List;

public class CSVReportFormatter implements ReportFormatter {
    @Override
    public void generate(List<Object> data) {
        // Logic to generate a CSV report
        System.out.println("CSV report generated.");
    }
}
