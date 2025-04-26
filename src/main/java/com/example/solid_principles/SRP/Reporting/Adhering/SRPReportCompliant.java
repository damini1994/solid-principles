package com.example.solid_principles.SRP.Reporting.Adhering;

public class SRPReportCompliant {
    public static void main(String[] args) {
        DataFetcher fetcher = new DataFetcher();
        PDFReportFormatter pdfFormatter = new PDFReportFormatter();
        CSVReportFormatter csvFormatter = new CSVReportFormatter();

        ReportGenerator pdfGenerator = new ReportGenerator(fetcher, pdfFormatter);
        pdfGenerator.generateReport();

        ReportGenerator csvGenerator = new ReportGenerator(fetcher, csvFormatter);
        csvGenerator.generateReport();
    }
}
