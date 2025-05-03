package com.example.solid_principles.DIP.DataReporting.Violation;

public class JSONDataSource {
    public String fetchData() {
        System.out.println("Fetching data from JSON source.");
        return "{ \"data\": \"...\" }";
    }
}
