package com.example.solid_principles.DIP.DataReporting.Adhering;

public class DIPReportDataSourceCompliant {
    public static void main(String[] args) {
        DataSource xmlSource = new XMLDataSource();
        ReportGenerator xmlReport = new ReportGenerator(xmlSource);
        xmlReport.generateReport();

        DataSource jsonSource = new JSONDataSource();
        ReportGenerator jsonReport = new ReportGenerator(jsonSource);
        jsonReport.generateReport();

        DataSource csvSource = new CSVDataSource();
        ReportGenerator csvReport = new ReportGenerator(csvSource);
        csvReport.generateReport();

        // Adding a new data source only requires creating a new class implementing DataSource
        // and passing it to the ReportGenerator, without modifying ReportGenerator itself.
    }
}
