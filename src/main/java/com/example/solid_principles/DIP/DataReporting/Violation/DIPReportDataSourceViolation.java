package com.example.solid_principles.DIP.DataReporting.Violation;

public class DIPReportDataSourceViolation {
    public static void main(String[] args) {
        ReportGenerator xmlReport = new ReportGenerator("xml");
        xmlReport.generateReport();

        ReportGenerator jsonReport = new ReportGenerator("json");
        jsonReport.generateReport();

        // If we add a new data source (e.g., CSV), we have to modify ReportGenerator.
    }
}
