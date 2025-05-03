package com.example.solid_principles.DIP.DataReporting.Violation;

public class ReportGenerator {
    private XMLDataSource xmlSource;
    private JSONDataSource jsonSource;
    private String currentSourceType;

    public ReportGenerator(String sourceType) {
        this.currentSourceType = sourceType;
        if ("xml".equalsIgnoreCase(sourceType)) {
            this.xmlSource = new XMLDataSource();
            this.jsonSource = null;
        } else if ("json".equalsIgnoreCase(sourceType)) {
            this.xmlSource = null;
            this.jsonSource = new JSONDataSource();
        } else {
            throw new IllegalArgumentException("Unsupported data source type.");
        }
    }

    public String generateReport() {
        String data = "";
        if (xmlSource != null) {
            data = xmlSource.fetchData();
        } else if (jsonSource != null) {
            data = jsonSource.fetchData();
        }
        System.out.println("Generating report from data: " + data.substring(0, 20) + "...");
        return "Report based on " + currentSourceType + " data.";
    }
}
