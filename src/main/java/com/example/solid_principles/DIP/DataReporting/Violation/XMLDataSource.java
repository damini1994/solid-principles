package com.example.solid_principles.DIP.DataReporting.Violation;

public class XMLDataSource {
    public String fetchData() {
        System.out.println("Fetching data from XML source.");
        return "<data>...</data>";
    }
}
