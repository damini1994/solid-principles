package com.example.solid_principles.SRP.Reporting.Adhering;

import java.util.ArrayList;
import java.util.List;

public class DataFetcher {
    public List<Object> fetchData() {
        // Logic to fetch data from a source
        System.out.println("Data fetched for the report.");
        return new ArrayList<>();
    }
}
