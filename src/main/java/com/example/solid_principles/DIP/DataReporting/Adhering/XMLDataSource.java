package com.example.solid_principles.DIP.DataReporting.Adhering;

public class XMLDataSource implements DataSource {
    @Override
    public String fetchData() {
        System.out.println("Fetching data from XML source.");
        return "<data>Important XML Data</data>";
    }
}
