package com.example.solid_principles.DIP.DataReporting.Adhering;

public class ReportGenerator {
    private DataSource dataSource;

    // Inject the dependency through the constructor
    public ReportGenerator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String generateReport() {
        String data = dataSource.fetchData();
        System.out.println("Generating report from data: " + data.substring(0, 25) + "...");
        return "Report based on provided data source.";
    }
}
