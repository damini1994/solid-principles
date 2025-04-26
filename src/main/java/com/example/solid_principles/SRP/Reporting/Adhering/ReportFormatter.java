package com.example.solid_principles.SRP.Reporting.Adhering;

import java.util.List;

public interface ReportFormatter {
    void generate(List<Object> data);
}
