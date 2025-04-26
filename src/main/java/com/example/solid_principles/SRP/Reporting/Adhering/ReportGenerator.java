package com.example.solid_principles.SRP.Reporting.Adhering;

import java.util.List;

public class ReportGenerator {
    private DataFetcher dataFetcher;
    private ReportFormatter formatter;

    public ReportGenerator(DataFetcher dataFetcher, ReportFormatter formatter) {
        this.dataFetcher = dataFetcher;
        this.formatter = formatter;
    }

    public void generateReport() {
        List<Object> data = dataFetcher.fetchData();
        formatter.generate(data);
    }
}
