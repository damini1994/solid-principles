package com.example.solid_principles.DIP.DataReporting.Adhering;

public class JSONDataSource implements DataSource {
    @Override
    public String fetchData() {
        System.out.println("Fetching data from JSON source.");
        return "{ \"data\": \"Valuable JSON Data\" }";
    }
}
