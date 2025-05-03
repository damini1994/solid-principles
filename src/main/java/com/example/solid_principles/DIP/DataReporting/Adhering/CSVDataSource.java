package com.example.solid_principles.DIP.DataReporting.Adhering;

public class CSVDataSource implements DataSource {
    @Override
    public String fetchData() {
        System.out.println("Fetching data from CSV source.");
        return "header1,header2\nvalue1,value2";
    }
}
