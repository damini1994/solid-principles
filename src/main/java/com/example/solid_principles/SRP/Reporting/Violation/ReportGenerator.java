package com.example.solid_principles.SRP.Reporting.Violation;

import java.util.List;

public class ReportGenerator {
        public void fetchData() {
            // Logic to fetch data from a source
            System.out.println("Data fetched for the report.");
        }

        public void generatePDF(List<Object> data) {
            // Logic to generate a PDF report
            System.out.println("PDF report generated.");
        }

        public void generateCSV(List<Object> data) {
            // Logic to generate a CSV report
            System.out.println("CSV report generated.");
        }
}
